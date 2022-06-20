package AtlMobileAppAuto;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.sql.DriverPropertyInfo;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class RecipientAdd extends Config {


    //without payment channel selection
    @Test
    public void addRecipient() throws MalformedURLException {


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

        driver.findElementByXPath("//android.widget.EditText[@text='Search country']").sendKeys("Belgium");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.TextView[@text=' Belgium']").click();

        driver.findElementByXPath("//android.widget.EditText[@text='First Name']").sendKeys("Ravi");
        driver.findElementByXPath("//android.widget.EditText[@text='Last Name']").sendKeys("Ojha");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Bank ']").sendKeys("SBTF");
        driver.findElementByXPath("//android.widget.EditText[@text='IBAN ']").sendKeys("BE68539017547014");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Family']").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.Button[@text='Save']").click();

    }


    // with payment channel selection
    @Test
    public void withPaymentChannelMobileWallet() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Login block------------------------------
        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys("qa222@yopmail.com");
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys("Qa123!");
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();
        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        //--------------------------------------------------

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

        //Recipient click
        driver.findElementById("com.atlmt:id/recipients").click();
        //Recipient add
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
        //Country selection
        driver.findElementByXPath("//android.widget.EditText[@text='Search country']").sendKeys("Benin");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElementByXPath("//android.widget.TextView[@text=' Benin']").click();
        //Payment channel selection

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.TextView[@text='Mobile Wallet']").click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElementByXPath("//android.widget.EditText[@text='First Name']").sendKeys("Vijay");
        driver.findElementByXPath("//android.widget.EditText[@text='Last Name']").sendKeys("Dewarakonda");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Mobile Network ']").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.TextView[@text='Moov Money']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Mobile Number ']").sendKeys("85422646");
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Bank ']").sendKeys("IDFT");
        driver.findElementByXPath("//android.widget.EditText[@text='IBAN ']").sendKeys("BE68539007547034");*/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Relationship']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Friend']").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.Button[@text='Save']").click();

    }


    @Test
    public void withPaymentChannelOTCCashPickUp() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Login block------------------------------
        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys("qa222@yopmail.com");
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys("Qa123!");
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();
        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        //--------------------------------------------------

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

        //Recipient click
        driver.findElementById("com.atlmt:id/recipients").click();
        //Recipient add
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
        //Country selection
      driver.findElementByXPath("//android.widget.EditText[@text='Search country']").sendKeys("Benin");

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElementByXPath("//android.widget.TextView[@text=' Benin']").click();
        //Payment channel selection
        driver.findElementByXPath("//android.widget.TextView[@text='OTC Cash Pickup']").click();

        driver.findElementByXPath("//android.widget.EditText[@text='First Name']").sendKeys("Alon");
        driver.findElementByXPath("//android.widget.EditText[@text='Last Name']").sendKeys("Mussk");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Address Line 1 ']").sendKeys("BL Street");
        driver.findElementByXPath("//android.widget.EditText[@text='City ']").sendKeys("New York City3");
        driver.findElementByXPath("//android.widget.EditText[@text='Mobile Number ']").sendKeys("96545254");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Friend']").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.Button[@text='Save']").click();

    }



    @Test
    public void withPaymentChannelAccountTransafer() throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Login block------------------------------
        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys("qa222@yopmail.com");
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys("Qa123!");
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();
        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
        //--------------------------------------------------

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

        //Recipient click
        driver.findElementById("com.atlmt:id/recipients").click();
        //Recipient add
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
        //Country selection
        driver.findElementByXPath("//android.widget.EditText[@text='Search country']").sendKeys("Benin");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElementByXPath("//android.widget.TextView[@text=' Benin']").click();
        //Payment channel selection
        driver.findElementByXPath("//android.widget.TextView[@text='Account Transfer']").click();

        driver.findElementByXPath("//android.widget.EditText[@text='First Name']").sendKeys("Grigory");
        driver.findElementByXPath("//android.widget.EditText[@text='Last Name']").sendKeys("Blockstain");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Bank Of Africa Bénin - BOAB']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Branch Code ']").sendKeys("DF446");
        driver.findElementByXPath("//android.widget.EditText[@text='Account Number ']").sendKeys("452126222528");
        driver.findElementByXPath("//android.widget.EditText[@text='RIB Key ']").sendKeys("55");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.EditText[@text='Relationship']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Business']").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        /*WebElement e =  driver.findElementByXPath("//android.widget.Button[@text='Save']");
        try {
            TouchActions action = new TouchActions(driver);
            action.scroll(e, 10, 100);
            action.perform();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        //Scroll app page
        /*HashMap<String ,Object>scrollObject = new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("text","Save");

        driver.executeScript("mobile:scroll", scrollObject);*/

        //driver.findElementByAccessibilityId("Save").click();


        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Save\"));");
        //scroll down to the element and click
        driver.findElementByXPath("//android.widget.Button[@text='Save']").click();



    }


}



