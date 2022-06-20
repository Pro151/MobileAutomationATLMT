package AtlMobileAppAuto;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DocUpload extends Config {

		// TODO Auto-generated method stub
		@Test
		public void doc() throws MalformedURLException {
			// TODO Auto-generated method stub
			
			AndroidDriver<AndroidElement>driver = capabilities();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//XPATH
			//tagname[@attribute='value]
			driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
			WebElement email =  driver.findElementByXPath("//android.widget.EditText[@text='Email']");
			email.sendKeys("qa222@yopmail.com");
			WebElement password =  driver.findElementByXPath("//android.widget.EditText[@text='Password']");
			password.sendKeys("Qa123!");
			
			//driver.findElementByXPath("//android.widget.ImageButton[@text='']").click();
			
			//driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();
			
			//WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
			//termsAndConditionsCheckbox.click();
			
			driver.findElementByXPath("//android.widget.Button[@text='Login']").click();

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
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("text(\"UPLOAD\")").click();
			//Proof Of Identity --> Passport
			driver.findElementByAndroidUIAutomator("text(\"Proof of Identity\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Passport\")").click();
			driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Upload\")").click();
			driver.findElementByAndroidUIAutomator("text(\"WHILE USING THE APP\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Files\")").click();
			driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Images\")").click();
			
			//Proof Of Identity --> Driving License
			driver.findElementByAndroidUIAutomator("text(\"Proof of Identity\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Driver's license\")").click();
			driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Upload\")").click();
			driver.findElementByAndroidUIAutomator("text(\"WHILE USING THE APP\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Files\")").click();
			driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Images\")").click();
			
			//Proof Of Identity --> Driving License
			driver.findElementByAndroidUIAutomator("text(\"Proof of Identity\")").click();
			driver.findElementByAndroidUIAutomator("text(\"National ID\")").click();
			driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Upload\")").click();
			driver.findElementByAndroidUIAutomator("text(\"WHILE USING THE APP\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Files\")").click();
			driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Images\")").click();
			
			//driver.findElementByAndroidUIAutomator("text(\"\")").click();
			
			//driver.findElementsByAndroidUIAutomator("new UIselector().clickable(true)");
			
			
			

		

	}
		
		
		

}
