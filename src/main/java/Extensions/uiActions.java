package Extensions;

import Utilities.commonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class uiActions extends commonOps {
    public static void  click(WebElement elem){

            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    public static void  updateText(WebElement elem,String value) {

        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }
}
