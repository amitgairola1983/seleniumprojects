package slateandtell.bar.webdriver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class general_webDriver {
	
	public WebDriver driver;
	
	
	public WebDriver set_driver()
	{
		System.setProperty("webdriver.edge.driver", "D:\\SeleniumWebDriverJRE\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		return driver;
	}
	
	

}
