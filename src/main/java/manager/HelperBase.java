package manager;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type (By locator, String text){
        if(text != null && !text.isEmpty()) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }

    // 1000ms = 1sec
    public void pause( int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   /* public void openElementByCssSelectorCoordinates(By locator) {
        Rectangle rect = wd.findElement(By.cssSelector(".checkbox-container")).getRect();
        int x = rect.getX() + 5;//left top corner
        int y = rect.getY() + 1/4 *rect.getHeight();
        Actions actions = new Actions(wd);
        actions.moveByOffset(x,y).click().perform();//to navigate the cursor+click+do
    }*/
}

