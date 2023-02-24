package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class MobilBrowserTesting {

    @Test
    public void Mobil() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0");
        caps.setCapability("deviceName", "realDevice");
        caps.setCapability("browserName", "chrome");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
        caps.setCapability("chromedriverExecutable", "C:\\Users\\hakan\\Desktop\\MobileTestingWithAppiumAndTestNG-main\\src\\test\\java\\Driver\\chromedriver.exe");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);

        driver.get("https://www.amazon.com/tr");
        MobileElement singUpTitle=driver.findElement(By.tagName("h2"));
        Assert.assertTrue(singUpTitle.isEnabled());
        Set<String> allkinds=driver.getContextHandles();
        for (String each:allkinds
        ) {
            System.out.println(each);
            if (each.contains("WEBVIEW_chrome")){
                driver.context(each);
            }

        }
        System.out.println(driver.getContext()+"  Anasayfaya gidildi");

        MobileElement logo= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(logo.isEnabled());

        MobileElement singUp=driver.findElement(By.xpath("//a[@id='nav-logobar-greeting']"));
        singUp.click();



        MobileElement newAccount=driver.findElement(By.xpath("//a[@id='register_accordion_header']"));
        newAccount.isDisplayed();
        newAccount.click();

        driver.findElement(By.xpath("//*[@id='ap_customer_name']"))
                .sendKeys("Sezer" + Keys.ENTER);

    }
}