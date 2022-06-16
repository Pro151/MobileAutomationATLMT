package AtlMobileAppAuto;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.sql.DriverPropertyInfo;
import java.util.concurrent.TimeUnit;

public class RecipientAdd extends Config {

    @Test
    public void addRecipient() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys("qa222@yopmail.com");
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys("Qa123!");
        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElementByXPath("//android.widget.Button[@text='CANCEL']").click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementById("com.atlmt:id/recipients").click();
        driver.findElementById("com.atlmt:id/appcompatAdd").click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*WebElement sC = driver.findElementByXPath("//android.widget.TextView[@text='Ivory Coast'");
        TouchActions action = new TouchActions(driver);
        action.scroll(sC, 2, 10);
        action.perform();
        sC.click();*/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Search country'").sendKeys("Belgium");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.TextView[@text='Belgium'").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='First Name'").sendKeys("Armin");
        driver.findElementByXPath("//android.widget.EditText[@text='Last Name'").sendKeys("Lauran");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Bank'").sendKeys("IDFT");
        driver.findElementByXPath("//android.widget.EditText[@text='IBAN'").sendKeys("IV45465465456454456465446");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Family'").click();

    }


}
