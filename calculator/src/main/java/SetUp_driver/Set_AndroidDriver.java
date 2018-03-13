package SetUp_driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Set_AndroidDriver {
	
	DesiredCapabilities capability;
	URL url;
	public WebDriver driver;
	
	public WebDriver Set_AndroidDevice() throws MalformedURLException
	{
		capability=new DesiredCapabilities();
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "7.0");
		capability.setCapability("deviceName", "ZY2243FK9M");
		capability.setCapability("appiumVersion", "1.6.4");
		capability.setCapability("appPackage", "com.google.android.calculator");
		capability.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url, capability);
		
		return driver;
		
	}
	
	
	

}
