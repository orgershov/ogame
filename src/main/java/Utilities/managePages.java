package Utilities;


import PageObjects.LoginPage;

import PageObjects.MainMenu;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base {
    public static void init() {
        OgameLogin = PageFactory.initElements(driver, LoginPage.class);
        GameMenu = PageFactory.initElements(driver, MainMenu.class);
    }


}
