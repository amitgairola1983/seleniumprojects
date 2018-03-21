package slateandtell.bar.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class bar_pagefactory {
	
	@FindBy(how=How.CSS, using="input[id='chain_type'][type='radio']")
	WebElement chain_length;
	
	@FindBy(how=How.ID, using="stoneType_1")
	WebElement stone_position1;
	
	@FindBy(how=How.ID, using="stoneType_2")
	WebElement stone_position2;
	
	@FindBy(how=How.ID, using="stoneType_3")
	WebElement stone_position3;
	
	@FindBy(how=How.ID, using="stoneType_4")
	WebElement stone_position4;
	
	@FindBy(how=How.ID, using="stoneType_5")
	WebElement stone_position5;

	@FindBy(how=How.CSS, using="select[id='fontType_1'][name='fontType_1']")
	WebElement fontcase;
	
	@FindBy(how=How.ID, using="text_on_1")
	WebElement desiredtext;
	
	@FindBy(how=How.ID, using="zipcode")
	WebElement zip;
	
	@FindBy(how=How.CLASS_NAME, using="btn btn-primary")
	WebElement addtocart;
	
	public WebElement chain_length()
	{
		return chain_length;
	}

	public WebElement stone_position1()
	{
		return stone_position1;
	}
	public WebElement stone_position2()
	{
		return stone_position2;
	}
	public WebElement stone_position3()
	{
		return stone_position3;
	}
	public WebElement stone_position4()
	{
		return stone_position4;
	}
	public WebElement stone_position5()
	{
		return stone_position5;
	}
	public WebElement fontcase()
	{
		return fontcase;
	}
	public WebElement desiredtext()
	{
		return desiredtext;
	}
	public WebElement zip()
	{
		return zip;
	}
	public WebElement addtocart()
	{
		return addtocart;
	}
	
}
