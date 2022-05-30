package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class loginOgame extends commonOps {
   public static JavascriptExecutor js = (JavascriptExecutor) driver;
    public static void login() {

        //personal detail page
        WebElement registerBtn= driver.findElement(By.id("register"));
        registerBtn.click();

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("or");

        WebElement lastnName = driver.findElement(By.id("lastname"));
        lastnName.sendKeys("gershov");

        WebElement ID = driver.findElement(By.id("personalId"));
        ID.sendKeys("333444555");

        WebElement phoneNumber = driver.findElement(By.id("phone"));
        phoneNumber.sendKeys("0505858976");

        WebElement birthDate = driver.findElement(By.id("dateOfBirth"));
        birthDate.sendKeys("22/04/2001");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[1]/div[4]/div[2]/div/div/div[1]"));
        gender.click();

        WebElement termsChekBox = driver.findElement(By.id("agreeTerms"));
        termsChekBox.click();

        WebElement submit = driver.findElement(By.className("button-big"));
        submit.click();


        //ocupation page

        WebElement isStudent = driver.findElement(By.id("isStudentNo"));
        isStudent.click();
        WebElement submit02 = driver.findElement(By.className("button-big"));
        submit02.click();


        //details page
        WebElement cityOfResidance = driver.findElement(By.id("residence"));
        cityOfResidance.sendKeys("אריאל");

        WebElement isHaveCar = driver.findElement(By.id("hasCarYes"));
        isHaveCar.click();

        //scroll down the page
        //js.executeScript("window.scrollBy(0,750)", "");

        WebElement whereToHelp = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[4]/div[2]/div/div/div[1]/label/span[2]"));
        whereToHelp.click();

        WebElement whichDay = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[4]/div[4]/div[1]/div/div/label/span[2]"));
        whichDay.click();

        //scroll down the page
        //js.executeScript("window.scrollBy(0,400)", "");

        WebElement whichHour = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[4]/div[9]/div[1]/div/div/label/span[2]"));
        whichHour.click();

        WebElement whichLenguge = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[4]/div[12]/div[1]/div/div/label/input"));
        whichLenguge.click();

        WebElement submit03 = driver.findElement(By.className("button-big"));
        submit03.click();


        //loginDetails page
        WebElement mail = driver.findElement(By.id("email"));
        mail.sendKeys("ooo@mail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("qwerty");

        WebElement submit04 = driver.findElement(By.className("button-big"));
        submit04.click();

        uiActions.click(OgameLogin.loginTab);
        uiActions.updateText(OgameLogin.username,"or.gershov@poalim.co.il");
        uiActions.updateText(OgameLogin.password,"Og@p8s1ae2cob3");
        uiActions.click(OgameLogin.logingBtn);
        uiActions.click(OgameLogin.playBtn);
        uiActions.click(OgameLogin.playBtn2);

    }
}
