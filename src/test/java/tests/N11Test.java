package tests;

import Locators.N11Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;

public class N11Test {

    AndroidDriver<AndroidElement> driver;
    N11Page n11Page;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
        desiredCapabilities.setCapability("platformVersion",ConfigReader.getProperty("platformVersion"));
        desiredCapabilities.setCapability("deviceName",ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability("automationName",ConfigReader.getProperty("automationName"));
        desiredCapabilities.setCapability("appPackage",ConfigReader.getProperty("n11Package"));
        desiredCapabilities.setCapability("appActivity",ConfigReader.getProperty("n11Activity"));
        driver= new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        n11Page =new N11Page(driver);
    }

    @Test
    public void searchBoxFunctionality(){
        n11Page.clickSearchBox();
        n11Page.typeSearchBoxAndHitEnter("Lenovo Thinkpad");

    }
}
