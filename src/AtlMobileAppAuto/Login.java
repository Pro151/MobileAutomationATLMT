package AtlMobileAppAuto;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login extends Config {

    @AfterTest
    public void loginPage() throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //XPATH
        //tagname[@attribute='value]
        driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
        WebElement email = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        email.sendKeys("s915@gmail.com");
        WebElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        password.sendKeys("Aa1234!@#$");

        driver.findElementByXPath("//android.widget.ImageButton[@text='']").click();

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

    }

}