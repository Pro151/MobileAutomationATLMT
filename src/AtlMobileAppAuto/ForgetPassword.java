package AtlMobileAppAuto;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ForgetPassword extends Config {

    @Test
    public void ForgorPwd() throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //XPATH
        //tagname[@attribute='value]


        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Forgot Password?']").click();
        //WebElement email =  driver.findElementByXPath("//android.widget.EditText[@text='Email'][3]");
        //email.sendKeys("promitm55@gmail.com");

        driver.findElementByAndroidUIAutomator("text(\"Email\")").sendKeys("agfatsseerr43@gmail.com");

        driver.findElementByXPath("//android.widget.Button[@text='Submit']").click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

}
