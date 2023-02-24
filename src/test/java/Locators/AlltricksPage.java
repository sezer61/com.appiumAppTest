package Locators;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AlltricksPage {
    AndroidDriver driver;

    public AlltricksPage(AndroidDriver driver){
        this.driver = driver;
    }

    By cookies= By.xpath("//button[@id='didomi-notice-agree-button']");
    By signIn= By.xpath("//*[@class='allfont allfont-perso']");

    public void cookies(){
        if(driver.findElement(cookies).isDisplayed()){
            driver.findElement(cookies).click();
        }
    }
    public void signIn(){driver.findElement(signIn).click();}
}
