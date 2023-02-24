package tests;

import Locators.AlltricksPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;

public class AlltricksTest {
    AndroidDriver<AndroidElement> driver;
    AlltricksPage alltricksPage=new AlltricksPage(driver);
    @BeforeClass
    public void Mobil() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0");
        caps.setCapability("deviceName", "realDevice");
        caps.setCapability("browserName", "chrome");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "80000");
        caps.setCapability("chromedriverExecutable", "C:\\Users\\hakan\\Desktop\\com.appiumAppTest\\src\\test\\java\\Driver\\chromedriver.exe");

        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);
    }
        @Test
        public void alltricksTest () throws InterruptedException {
            driver.get(ConfigReader.getProperty("alltricksUrl"));

            WebElement cookies=driver.findElement(By.xpath("//*[@id='didomi-notice-agree-button']"));
            cookies.click();
            WebElement signIn =driver.findElement(By.xpath("//*[@class='allfont allfont-perso']"));
            signIn.click();


        }
    }


