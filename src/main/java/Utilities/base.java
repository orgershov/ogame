package Utilities;

import PageObjects.LoginPage;
import PageObjects.MainMenu;
import WorkFlows.loginOgame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base  {
    public  static WebDriver driver;
    public  static WebDriverWait wait;

    public static LoginPage OgameLogin;
    public static MainMenu GameMenu;
}
