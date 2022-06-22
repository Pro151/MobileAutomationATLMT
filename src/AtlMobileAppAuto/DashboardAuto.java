package AtlMobileAppAuto;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DashboardAuto extends Config {

    @Test
    public void AutoDashboard() throws MalformedURLException {

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

        driver.findElementById("com.atlmt:id/appcompatImageViewMenu").click();

        //Edit personal profile
        driver.findElementByXPath("//android.widget.TextView[@text='Personal Profile']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Aron']").sendKeys("Aronika");
        driver.findElementByXPath("//android.widget.EditText[@text='mcall']").sendKeys("Mcanly");

        driver.findElementByXPath("//android.widget.EditText[@text='Sunday 13 June 2004']").click();
        driver.findElementById("com.atlmt:id/year").click();
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"1991\"));");

        try {
            scroll(driver, 0.5, 0.8, 0.5, 0.2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElementByXPath("//android.widget.TextView[@text='2004']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Ok']").click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElementByXPath("//android.widget.EditText[@text='Argentinean']").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\" Australian\"));");
        driver.findElementByXPath("//android.widget.TextView[@text=' Australian']").click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementById("com.atlmt:id/button").click();


        //edit contact details


    }


    public void scroll(AppiumDriver<AndroidElement> driver, double start_xd, double start_yd, double end_xd, double end_yd) throws InterruptedException {

        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * start_xd);
        int start_y = (int) (dimension.height * start_yd);

        int end_x = (int) (dimension.width * end_xd);
        int end_y = (int) (dimension.height * end_yd);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();

        Thread.sleep(3000);


    }

    /*public void scrollDown(AppiumDriver<AndroidElement> driver,double start_xd, double start_yd, double end_xd, double end_yd) throws InterruptedException {

        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * end_xd);
        int start_y = (int) (dimension.height * end_yd);

        int end_x = (int) (dimension.width * start_xd);
        int end_y = (int) (dimension.height * start_yd);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();

        Thread.sleep(3000);


    }*/
}
