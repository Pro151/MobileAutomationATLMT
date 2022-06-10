package AtlMobileAppAuto;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Config {

	//public static void main(String[] args) throws MalformedURLException 
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
		// TODO Auto-generated method stub
		
		//File appDir=new File("src");  
		//File app = new File(appDir,"ApiDemos-debug.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PromitEmulator");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy F41");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9 Pro");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy F41");
		//cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath() );
		cap.setCapability(MobileCapabilityType.UDID,"4b546ff8");
		//cap.setCapability(MobileCapabilityType.UDID,"RZ8N91J7H3R");
		cap.setCapability("appPackage","com.atlmt");
		cap.setCapability("appActivity","com.atlmt.ui.splash.Splash");
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
	}

}
