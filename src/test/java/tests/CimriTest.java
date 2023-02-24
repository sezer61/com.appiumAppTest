package tests;

import Locators.CimriUserInterFacePage;
import Locators.N11UserInterfacePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;

public class CimriTest {
    AndroidDriver<AndroidElement> driver;
    CimriUserInterFacePage cimriUserInterFacePage;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
        desiredCapabilities.setCapability("platformVersion",ConfigReader.getProperty("platformVersion"));
        desiredCapabilities.setCapability("deviceName",ConfigReader.getProperty("deviceName"));
        desiredCapabilities.setCapability("automationName",ConfigReader.getProperty("automationName"));
        desiredCapabilities.setCapability("appPackage",ConfigReader.getProperty("cimriPackage"));
        desiredCapabilities.setCapability("appActivity",ConfigReader.getProperty("cimriActivity"));
        driver= new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        cimriUserInterFacePage=new CimriUserInterFacePage(driver);
    }
    @Test
    public void test01(){


    }
}
