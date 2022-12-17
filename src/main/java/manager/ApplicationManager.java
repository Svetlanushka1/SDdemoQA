package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    HelperStudentForm studentForm;

    public void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("load-extension=C:\\tools\\5.3.2_0");//C:\tools\5.3.2_0
        wd = new ChromeDriver(options);


        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com");
        studentForm = new HelperStudentForm(wd);
        // Thread.sleep();
        returnToDemoQa();

    }

    private void returnToDemoQa() {
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1)).close();
        wd.switchTo().window(tabs.get(0));
    }


    public void stop() {
        // wd.quit();

    }

    public HelperStudentForm studentForm() {
        return studentForm;
    }
}
        //WebDriverWait waitDriver = new WebDriverWait(wd,5);
              //WebElement element = waitDriver.until(ExpectedConditions.visibilityOf(wd.findElement((By.id(" ")));
              //WebElement element = waitDriver.until(ExpectedConditions.elementToBeClickable(wd.findElement(By.id(""))));





    //https://www.toolsqa.com/

