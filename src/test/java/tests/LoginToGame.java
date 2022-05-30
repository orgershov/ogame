package tests;

import Utilities.commonOps;
import WorkFlows.Resources;
import WorkFlows.loginOgame;
import org.testng.annotations.Test;

public class LoginToGame extends commonOps
{
    @Test
    public void  test01_loging(){

        loginOgame.login();
        Resources.Res();

    }
}
