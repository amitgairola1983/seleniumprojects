package Mult_Package;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import SetUp_driver.Set_AndroidDriver;
import calculator_pagefactory.PageFactory_Class;

public class Mult_Func {
	
	WebDriver driver;
	Set_AndroidDriver android;
	PageFactory_Class pagefactory;
	WebElement num1, num2, oper, eq, result;
	
	@BeforeSuite
	public void init() throws MalformedURLException
	{
	
		android=new Set_AndroidDriver();
		driver=android.Set_AndroidDevice();
		pagefactory=PageFactory.initElements(driver, PageFactory_Class.class);
		
		
	}
	
	@Test
	public void multiply_function() throws InterruptedException
	{
		num1= pagefactory.ret_num1();
		num2= pagefactory.ret_num2();
		oper=pagefactory.ret_oper();
		eq= pagefactory.ret_equal();
		result= pagefactory.ret_result();
		
		Thread.sleep(3000);
		Assert.assertTrue(num1.getText().contains("7"));
		num1.click();
		Assert.assertTrue(oper.getText().contains("×"));
		oper.click();
		Assert.assertTrue(num2.getText().contains("4"));
		num2.click();
		Assert.assertTrue(eq.getText().contains("="));
		eq.click();
		
		Assert.assertTrue(result.getText().contains("28"));
		Reporter.log("Multiply Function is Executed and functioning sucessfully", true);
		
		
	}
	

}
