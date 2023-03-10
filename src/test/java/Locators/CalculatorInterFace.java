package Locators;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CalculatorInterFace {
    AndroidDriver driver;

    public CalculatorInterFace(AndroidDriver driver){
        this.driver = driver;
    }

    By num1 = MobileBy.AccessibilityId("3");
    By num2 = MobileBy.AccessibilityId("9");

    By multiplyingSign=By.id("com.google.android.calculator:id/op_mul");
    By dividingSign=By.id("com.google.android.calculator:id/op_div");

    By addSign=By.id("com.google.android.calculator:id/op_add");

    By subtractSign=By.id("com.google.android.calculator:id/op_sub");

    By equalsSign=By.id("com.google.android.calculator:id/eq");

    By deleteSign=By.id("com.google.android.calculator:id/del");

    By resultSpace=MobileBy.id("com.google.android.calculator:id/formula");

    By finalResultSpace=MobileBy.id("com.google.android.calculator:id/result_final");

    By clear=By.id("com.google.android.calculator:id/clr");





    int intNumber1;
    int intNumber2;


    public void clickClear(){
       driver.findElement(clear).click();
    }
   public void clickNum1(){
       driver.findElement(num1).click();
   }
   public void getNum1(){
       intNumber1 = Integer.parseInt(driver.findElement(resultSpace).getText());
   }
   public  void deleting(){
       driver.findElement(deleteSign).click();
   }
   public void clickNum2(){
       driver.findElement(num2).click();
   }
   public void getNum2(){
       intNumber2 = Integer.parseInt(driver.findElement(resultSpace).getText());
   }

   public void clickMultiplyingSign(){
       driver.findElement(multiplyingSign).click();
   }

   public void clickDividingSign(){
       driver.findElement(dividingSign).click();
   }
   public void clickAddSign(){
       driver.findElement(addSign).click();
   }
   public void clickSubtractSign(){
       driver.findElement(subtractSign).click();
   }


   public void clickEqualsSign(){
       driver.findElement(equalsSign).click();
   }

   public int expectedResult(String operation){
       switch(operation){
           case "+":
               return intNumber2 + intNumber1;
           case "-":
               return intNumber2 - intNumber1;
           case "*":
               return intNumber2 * intNumber1;
           case "/":
               return intNumber2 / intNumber1;
           default:
               return 0;
       }
   }

   public int actualResult(){
       return Integer.parseInt(driver.findElement(finalResultSpace).getText());
   }
}
