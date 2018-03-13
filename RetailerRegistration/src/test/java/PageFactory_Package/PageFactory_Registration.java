package PageFactory_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory_Registration {
	
	//Define all elements will be used while Automating Registration Process
	
	@FindBy(how=How.ID, using="name")
	WebElement name;
	
	@FindBy(how=How.ID, using="Email")
	WebElement Email;
	
	@FindBy(how=How.ID, using="address")
	WebElement address;
	
	@FindBy(how=How.ID, using="city")
	WebElement city;
	
	@FindBy(how=How.ID, using="state")
	WebElement state;
	
	@FindBy(how=How.ID, using="zipcode")
	WebElement zipcode;
	
	@FindBy(how=How.ID, using="website")
	WebElement website;
	
	@FindBy(how=How.ID, using="phone1")
	WebElement phone1;
	
	@FindBy(how=How.ID, using="passwd")
	WebElement passwd;
	
	@FindBy(how=How.ID, using="confPasswd")
	WebElement confPasswd;
	
	@FindBy(how=How.CSS, using="input[value='yes'][type='radio']")
	WebElement radio;
	
	@FindBy(how=How.CSS, using="input[id='t_c'][type='checkbox']")
	WebElement check;
	
	@FindBy(how=How.CSS, using="input[name='submit'][value='Create Account']")
	WebElement createaccount;
	
	@FindBy(how=How.CLASS_NAME, using="alert alert-info")
	WebElement alertmessage;
	
	
	//Function returning Registration page's element 
	public WebElement ret_name()
	{
		return name;
	}
	
	public WebElement ret_email()
	{
		return Email;
	}
	
	public WebElement ret_address()
	{
		return address;
	}
	
	public WebElement ret_city()
	{
		return city;
	}
	
	public WebElement ret_state()
	{
		return state;
	}
	public WebElement ret_zipcode()
	{
		return zipcode;
	}
	public WebElement ret_website()
	{
		return website;
	}
	public WebElement ret_phone1()
	{
		return phone1;
	}
	public WebElement ret_passwd()
	{
		return passwd;
	}
	public WebElement ret_confPasswd()
	{
		return confPasswd;
	}
	public WebElement ret_radio()
	{
		return radio;
	}
	public WebElement ret_check()
	{
		return check;
	}
	public WebElement ret_createaccount()
	{
		return createaccount;
	}
	
	public WebElement ret_alertmessage()
	{
		return alertmessage;
	}
	
	
	
}
