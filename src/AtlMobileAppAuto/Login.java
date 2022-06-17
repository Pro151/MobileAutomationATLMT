package AtlMobileAppAuto;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login extends Config {

    @Test(dataProvider = "dataProviderTest")
    public void loginPage(String uid1, String pwd1) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        //XPATH
        //tagname[@attribute='value]

        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys(uid1);
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys(pwd1);
        driver.findElementById("com.atlmt:id/text_input_end_icon").click();

        //driver.findElementByXPath("//android.widget.ImageButton[@text='']").click();

        //driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();

        //WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
        //termsAndConditionsCheckbox.click();

        driver.findElementByXPath("//android.widget.Button[@text='Login']").click();

        //driver.findElementsByAndroidUIAutomator("new UIselector().clickable(true)");


        //Country Selection

        //driver.findElementByAndroidUIAutomator("text(\"AUS Australia\")").click();

        //Personal Profile

        //driver.findElementByAndroidUIAutomator("text(\"First Name\")").sendKeys("Jashon");
        //driver.findElementByAndroidUIAutomator("text(\"Family Name\")").sendKeys("Broune");
        //driver.findElementByAndroidUIAutomator("text(\"Date of Birth \")").click();
        //driver.findElementByAndroidUIAutomator("text(\"2\")").click();
        //driver.findElementByAndroidUIAutomator("text(\"May 2005\")").click();


        //driver.findElementByAndroidUIAutomator("text(\"Nationality \")").click();
        //driver.findElementByAndroidUIAutomator("text(\"USA American \")").click();
        //driver.findElementByAndroidUIAutomator("text(\"Save\")").click();

        driver.quit();
    }

    @DataProvider
    public Object[][] dataProviderTest() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object[][] data2 = new Object[3][2];
        //1st set
        data2[0][0] = "qayy@yopmail.com";
        data2[0][1] = "Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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