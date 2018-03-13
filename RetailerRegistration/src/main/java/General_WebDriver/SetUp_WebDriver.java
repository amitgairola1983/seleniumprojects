package General_WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetUp_WebDriver {
	
	WebDriver driver;
	Properties p;
	File file;
	FileInputStream fis;
	
	public WebDriver init_webdriver(String path)
	{
		System.setProperty("webdriver.edge.driver", path);
		driver=new EdgeDriver();
		return driver;
		
	}
	
	public Properties set_property() throws IOException
	{
		p=new Properties();
		file=new File("G:\\Selenium2018\\MavenProjects\\RetailerRegistration\\config.properties");
		fis=new FileInputStream(file.getAbsolutePath());
		
		p.load(fis);
		
		return p;
		
		
	}
	

}
