package AtlMobileAppAuto;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LogOutAuto extends Config {

    @Test
    public void LogOutAuto1() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Login block------------------------------
        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys("qa222@yopmail.com");
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys("Qa123!");
        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        //--------------------------------------------------

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();
        driver.findElementByAndroidUIAutomator("text(\"2\")").click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElementByXPath("//android.widget.Button[@text='CANCEL']").click();
    }
}
