package calculator_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory_Class {
	
	@FindBy(how=How.ID, using="com.google.android.calculator:id/digit_7")
	WebElement num1;
	
	@FindBy(how=How.ID, using="com.google.android.calculator:id/digit_4")
	WebElement num2;
	
	@FindBy(how=How.ID, using="com.google.android.calculator:id/op_mul")
	WebElement mult_oper;
	
	@FindBy(how=How.ID, using="com.google.android.calculator:id/eq")
	WebElement equal;
	
	@FindBy(how=How.ID, using="com.google.android.calculator:id/result")
	WebElement result;
	
	public WebElement ret_num1()
	{
		return num1;
	}
	public WebElement ret_num2()
	{
		return num2;
	}
	public WebElement ret_oper()
	{
		return mult_oper;
	}
	
	public WebElement ret_equal()
	{
		return equal;
	}
	public WebElement ret_result()
	{
		return result;
	}
	
	
}
