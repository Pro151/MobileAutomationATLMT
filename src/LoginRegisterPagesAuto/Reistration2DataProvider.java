package LoginRegisterPagesAuto;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import ConfigPages.Config;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Reistration2DataProvider extends Config {

    @Test(dataProvider = "dataProvider1")
    public void AregistrationWithDataProvider(String uname1, String Pwd1, String CPwd1) throws MalformedURLException {


        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //XPATH
        //tagname[@attribute='value]
        driver.findElementByXPath("//android.widget.Button[@text='Create Account']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys(uname1);
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys(Pwd1);
        WebElement confirm_password = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
        confirm_password.sendKeys(CPwd1);

        driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
        //termsAndConditionsCheckbox.click();

        driver.findElementByXPath("//android.widget.Button[@text='Sign Up']").click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElementByAndroidUIAutomator("text(\"YES\")").click();

        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();


        driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1\")").click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    @Test(dataProvider = "dataProvider2")
    public void loginPage2(String uname2, String Pwd2) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



        //XPATH
        //tagname[@attribute='value]
        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys(uname2);
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys(Pwd2);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElementByXPath("//android.widget.ImageButton[@text='']").click();

        //driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();

        //WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
        //termsAndConditionsCheckbox.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();

    }


    @DataProvider
    public Object[][] dataProvider1() {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Object[][] data1 = new Object[3][3];
        //1st set
        data1[0][0] = "qayy@yopmail.com";
        data1[0][1] = "Qa123!";
        data1[0][2] = "Qa123!";
        //2nd set
        data1[1][0] = "qazza@yopmail.com";
        data1[1][1] = "Qa123!";
        data1[1][2] = "Qa123!";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //3rd set
		data1[2][0]="qatzz@yopmail.com";
		data1[2][1]="Qa123!";
		data1[2][2]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return data1;


    }

    @DataProvider
    public Object[][] dataProvider2() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object[][] data2 = new Object[3][2];
        //1st set
        data2[0][0] = "qayy@yopmail.com";
        data2[0][1] = "Qa123!";

        //2nd set
        data2[1][0] = "qazza@yopmail.com";
        data2[1][1] = "Qa123!";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //3rd set
		data2[2][0]="qatzz@yopmail.com";
		data2[2][1]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        return data2;


    }
}


