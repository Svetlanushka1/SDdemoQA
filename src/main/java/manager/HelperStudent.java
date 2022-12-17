package manager;

import models.Student;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HelperStudent extends HelperBase {
    public HelperStudent(WebDriver wd) {
        super(wd);
    }

    public void moveToFormsPage() {
        click(By.xpath("//div[@class='category-cards']/div[2]"));
       // click(By.xpath("/div[@class='home-body']//div[2]//div[1]//div[1]"));//->move to Forms page

    }
    public void clickOnButtonForms(){
        click(By.xpath("//div[2]/span[1]/div[1]"));
        //-> click on Forms button ob the FormsPage
    }
        //(By.cssSelector(".btn.btn-light.active"))
    public void selectFormByJavaScriptExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('div:nth-child(1) div:nth-child(3) h5:nth-child(1)').click();");
    }

    public void clickOnPracticeFormButton() {
        //click(By.xpath("//span[text()='Practice Form']"));}
        click(By.cssSelector(".element-list.collapse.show"));
}
    public void selectPracticeFormByJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('.btn.btn-light.active').click();");
    }

    public void fillStudentForm(Student student) {
        type(By.cssSelector(""), student.getFirstName());
        type(By.cssSelector(""), student.getLastName());
        type(By.cssSelector(""), student.getEmail());
        type(By.cssSelector(""), student.getPhone());
        type(By.cssSelector(""), student.getBirthday());
        type(By.cssSelector(""), student.getSubject());
        type(By.cssSelector(""), student.getHobbies());
        //select(By.ByCssSelector(""),student.getHobbies());
        type(By.cssSelector(""), student.getAddress());
        type(By.cssSelector(""), student.getState());
        type(By.cssSelector(""), student.getCity());
    }

}
/*

public void checkPolicy() {
        //Version 1:-> by selector
        //click(By.cssSelector("label[for='#terms-of-use']"));
        //version2: -> by JS
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('#terms-of-use').click();");
       // version 3: -> by coordinates

        Rectangle rect = wd.findElement(By.cssSelector(".checkbox-container")).getRect();
        int x = rect.getX() + 5;//left top corner
        int y = rect.getY() + 1/4 *rect.getHeight();
        Actions actions = new Actions(wd);
        actions.moveByOffset(x,y).click().perform();//to navigate the cursor+click+do
        }
 */

