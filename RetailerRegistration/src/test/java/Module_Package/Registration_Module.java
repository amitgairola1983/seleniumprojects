package Module_Package;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import General_WebDriver.SetUp_WebDriver;
import PageFactory_Package.PageFactory_Registration;

public class Registration_Module {
	
	WebDriver driver;
	WebDriverWait wait;
	SetUp_WebDriver set;
	PageFactory_Registration pf_reg;
	Properties p;
	WebElement name, email, address,city, state, zipcode, website, phone1, passwd, confpasswd, radio, check, createaccount, alertmesssage;
	
	
	@BeforeTest
	public void init_configuration() throws IOException
	{
		
		set=new SetUp_WebDriver();
		p=set.set_property();
		driver=set.init_webdriver(p.getProperty("path"));
		
		pf_reg= PageFactory.initElements(driver, PageFactory_Registration.class);
		
		wait=new WebDriverWait(driver, 15);
		
	}
	
	@Test
	public void Registration_Module() throws InterruptedException
	{
		//Calling all elements from PageFactory Page and storing class local variables
		name=pf_reg.ret_name();
		email=pf_reg.ret_email();
		address=pf_reg.ret_address();
		city=pf_reg.ret_city();
		state=pf_reg.ret_state();
		zipcode=pf_reg.ret_zipcode();
		website=pf_reg.ret_website();
		phone1=pf_reg.ret_phone1();
		passwd=pf_reg.ret_passwd();
		confpasswd=pf_reg.ret_confPasswd();
		radio=pf_reg.ret_radio();
		check=pf_reg.ret_check();
		createaccount=pf_reg.ret_createaccount();
		alertmesssage=pf_reg.ret_alertmessage();
		
		
		//Invoking registration page
		driver.get(p.getProperty("module_url"));
		wait.until(ExpectedConditions.visibilityOf(createaccount));
		
		Assert.assertEquals(name.getAttribute("name"), "name");
		name.sendKeys(p.getProperty("companyname"));
		
		Assert.assertEquals(email.getAttribute("name"), "Email");
		email.sendKeys(p.getProperty("email"));
		
		Assert.assertEquals(address.getAttribute("name"), "address");
		address.sendKeys(p.getProperty("address"));
		
		Assert.assertEquals(city.getAttribute("name"), "city");
		city.sendKeys(p.getProperty("city"));
		
		Assert.assertEquals(state.getAttribute("name"), "state");
		Select sel=new Select(state);
		sel.selectByIndex(4);
		
		Assert.assertEquals(zipcode.getAttribute("name"), "zipcode");
		zipcode.sendKeys(p.getProperty("postal"));
		
		Assert.assertEquals(website.getAttribute("name"), "website");
		website.sendKeys(p.getProperty("website"));
		
	//	Assert.assertTrue(phone1.getAttribute("name").contains("phone1"));
	//	phone1.sendKeys(p.getProperty("phone"));
		
		Assert.assertTrue(passwd.getAttribute("name").contains("passwd"));
		passwd.sendKeys(p.getProperty("password"));
		
		Assert.assertTrue(confpasswd.getAttribute("name").contains("confPasswd"));
		confpasswd.sendKeys(p.getProperty("cpassword"));
		
		Assert.assertTrue(radio.getAttribute("name").contains("web_module"));
		radio.click();
		
		Assert.assertTrue(check.getAttribute("name").contains("t_c"));
		check.click();
		
		Assert.assertTrue(createaccount.getAttribute("name").contains("submit"));
		createaccount.click();
		
		Thread.sleep(5000);
		String error = driver.switchTo().alert().getText();
		Reporter.log("Phone Number is missing", true);
		driver.switchTo().alert().accept();
	}
	
	@AfterTest
	public void quit()
	{
		
	}

}
