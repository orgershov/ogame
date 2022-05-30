package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainMenu {

    @FindBy(how = How.XPATH ,using = "//*[@id='menuTable']/li[2]/a/span")
    public WebElement Resources;

    @FindBy(how = How.XPATH ,using = "//*[@id='menuTable']/li[3]/a/span")
    public WebElement Facilities;

    @FindBy(how = How.XPATH ,using = "//*[@id='menuTable']/li[6]/a/span")
    public WebElement Research;

    @FindBy(how = How.XPATH ,using = "//*[@id='menuTable']/li[9]/a/span")
    public WebElement Fleet;
}
