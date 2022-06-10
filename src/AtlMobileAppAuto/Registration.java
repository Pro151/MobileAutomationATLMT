package AtlMobileAppAuto;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Registration extends Config {

	//public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
	@Test
	public void Aregistration(String urlName) throws MalformedURLException {
		AndroidDriver<AndroidElement>driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//XPATH
		//tagname[@attribute='value]
		driver.findElementByXPath("//android.widget.Button[@text='Create Account']").click();
		WebElement email =  driver.findElementByXPath("//android.widget.EditText[@text='Email']");
		email.sendKeys("v5fs3@gmail.com");
		WebElement password =  driver.findElementByXPath("//android.widget.EditText[@text='Password']");
		password.sendKeys("Aa1234!@#$");
		WebElement confirm_password =  driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
		confirm_password.sendKeys("Aa1234!@#$");
		
		driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();
		
		//WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
		//termsAndConditionsCheckbox.click();
		
		driver.findElementByXPath("//android.widget.Button[@text='Sign Up']").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 
		driver.findElementByAndroidUIAutomator("text(\"YES\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
	
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println(urlName);
		
	}
	
	@Test
	public void SkipTwoFactor() throws MalformedURLException {
		
		AndroidDriver<AndroidElement>driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//XPATH
		//tagname[@attribute='value]
		driver.findElementByXPath("//android.widget.Button[@text='Create Account']").click();
		WebElement email =  driver.findElementByXPath("//android.widget.EditText[@text='Email']");
		email.sendKeys("wak20@gmail.com");
		WebElement password =  driver.findElementByXPath("//android.widget.EditText[@text='Password']");
		password.sendKeys("Aa1234!@#$");
		WebElement confirm_password =  driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
		confirm_password.sendKeys("Aa1234!@#$");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();
		
		//WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
		//termsAndConditionsCheckbox.click();
		
		driver.findElementByXPath("//android.widget.Button[@text='Sign Up']").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 
		driver.findElementByAndroidUIAutomator("text(\"SKIP\")").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void loginRegisterHere() throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement>driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Register Here\")").click();
		WebElement email =  driver.findElementByXPath("//android.widget.EditText[@text='Email']");
		email.sendKeys("s91e5@gmail.com");
		WebElement password =  driver.findElementByXPath("//android.widget.EditText[@text='Password']");
		password.sendKeys("Aa1234!@#$");
		WebElement confirm_password =  driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
		confirm_password.sendKeys("Aa1234!@#$");
		
		driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();
		
		//WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
		//termsAndConditionsCheckbox.click();
		
		driver.findElementByXPath("//android.widget.Button[@text='Sign Up']").click();
		
		 
		driver.findElementByAndroidUIAutomator("text(\"YES\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Forgot PIN\")").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();*/
		
	}
	
	
	/*@Test(groups={"Sanity"})
	public void loginForgotPin() throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement>driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='Already Registered? Login']").click();
		driver.findElementByAndroidUIAutomator("text(\"Register Here\")").click();
		WebElement email =  driver.findElementByAndroidUIAutomator("//android.widget.EditText[@text='Email']");
		//WebElement email =  driver.findElementByAndroidUIAutomator("text(\"Email\")");
		email.sendKeys("ssrr123@gmail.com");
		WebElement password =  driver.findElementByXPath("//android.widget.EditText[@text='Password']");
		//WebElement password =  driver.findElementByAndroidUIAutomator("text(\"password\")");
		password.sendKeys("Aa1234!@#$");
		//driver.findElementByXPath("//android.widget.ImageButton[1]").click();
		WebElement confirm_password =  driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
		//WebElement confirm_password =  driver.findElementByAndroidUIAutomator("text(\"Confirm Password\")");
		confirm_password.sendKeys("Aa1234!@#$");
		//driver.findElementByXPath("//android.widget.ImageButton[2]").click();
		
		driver.findElementByXPath("//android.widget.CheckBox[@text='']").click();
		
		//WebElement termsAndConditionsCheckbox = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id(driver.getAndroidElementId("checkbox_terms_and_conditions"))));
		//termsAndConditionsCheckbox.click();
		
		driver.findElementByXPath("//android.widget.Button[@text='Sign Up']").click();
		
		 
		driver.findElementByAndroidUIAutomator("text(\"YES\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
	
		
		driver.findElementByAndroidUIAutomator("text(\"1\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3\")").click();
		driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Forgot PIN\")").click();
		
	}*/
	
	
	
	
		
		
		
	}
		




