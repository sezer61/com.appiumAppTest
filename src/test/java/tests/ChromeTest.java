package tests;

import Locators.CalculatorInterFace;
import Locators.ChromePage;
import Locators.CimriPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {

    ChromePage chromePage;
    @Test
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0");
        caps.setCapability("deviceName", "realDevice");
        caps.setCapability("browserName", "chrome");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"70000");
        caps.setCapability("chromedriverExecutable", "C:\\Users\\hakan\\Desktop\\com.appiumAppTest\\src\\test\\java\\Driver\\chromedriver.exe");



        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);

        driver.get("https://amazon.com");
        MobileElement el = driver.findElementByXPath("//input[@class='nav-input nav-progressive-attribute']");
        el.click();
        el.sendKeys("Nokia");

    }

    public void chromeTest01(){

        //driver.findElementById("com.android.chrome:id/terms_accept").click();
        //driver.findElementById("com.android.chrome:id/negative_button").click();
        //Amazon sayfasina gidildi

    }
}
