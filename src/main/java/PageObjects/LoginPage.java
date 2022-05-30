package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.XPATH ,using = "//ul[@class='tabsList']/li[1]/span")
    public WebElement loginTab;

    @FindBy(how = How.XPATH ,using = "//div[@class='inputWrap']//input[@name='email']")
    public WebElement username;
    @FindBy(how = How.XPATH ,using = "//div[@class='inputWrap']//input[@name='password']")
    public WebElement password;

    @FindBy(how = How.XPATH ,using = "//*[@id='loginForm']/p/button[1]/span")
    public WebElement logingBtn;


    //page after login

    @FindBy(how = How.XPATH ,using = "//*[@id='joinGame']/a/button")
    public WebElement playBtn;

    @FindBy(how = How.XPATH ,using = "//*[@id='accountlist']/div/div[1]/div[2]/div/div/div[11]/button")
    public WebElement playBtn2;



}
