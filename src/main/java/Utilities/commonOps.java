package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class commonOps extends  base{

    public  void  initBrowser(String browserType){

        if(browserType.equalsIgnoreCase("chrome")){
            driver = initChromeDriver();
        }
        else  if(browserType.equalsIgnoreCase("firefox")){
            driver = initFFDriver();
        }
        else  if(browserType.equalsIgnoreCase("ie")){
            driver = initIEDriver();
        }

        else {
            throw new RuntimeException("invalid platrofm ststed");
        }
        driver.manage().window().maximize();
        driver.get("http://students-aid.org:9222/");
        driver.manage().timeouts().implicitlyWait(Long.parseLong("1000"), TimeUnit.SECONDS);
              wait = new WebDriverWait(driver,10);

    }
    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver initFFDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
    public static WebDriver initIEDriver(){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }
    @BeforeClass

    public void startSession( ){


            initBrowser("chrome");
                  managePages.init();

    }
    @AfterMethod
    public void afterMethod(){


           // driver.get("https://lobby.ogame.gameforge.com/en_US/hubl");

    }
    @AfterClass
    public  void closeSession(){

       // driver.quit();
    }
}
