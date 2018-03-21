package slateandtell.bar.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import slateandtell.bar.pagefactory.bar_pagefactory;
import slateandtell.bar.webdriver.general_webDriver;

public class bar_regression {
	
	WebDriver driver;
	WebDriverWait wait;
	general_webDriver webdriver;
	bar_pagefactory pagefactory;
	WebElement chainlength, stone1, stone2, stone3, stone4, stone5, fontcase, zip, desiredtext,addtocart;
	
	@BeforeTest
	public void init_elements()
	{
		webdriver=new general_webDriver();
		driver=webdriver.set_driver();
		pagefactory=PageFactory.initElements(driver, bar_pagefactory.class);
		wait=new WebDriverWait(driver,10);
	}
	
	@Test
	public void bar_module()
	{
		chainlength=pagefactory.chain_length();
		stone1=pagefactory.stone_position1();
		stone2=pagefactory.stone_position2();
		stone3=pagefactory.stone_position3();
	    stone4=pagefactory.stone_position4();
	    stone5=pagefactory.stone_position5();
	    fontcase=pagefactory.fontcase();
	    desiredtext=pagefactory.desiredtext();
	    zip=pagefactory.zip();
	    addtocart= pagefactory.addtocart();
	    
	    driver.get("https://www.slateandtell.com/collections/birthstone/personalized-multi-stone-bar-necklace-spd12535bs3ssplwg.html");
	    Assert.assertTrue(driver.getTitle().contains("Bar"));
	    wait.until(ExpectedConditions.visibilityOf(chainlength));
	    Assert.assertTrue(chainlength.getAttribute("name").contains("chain"));
	    chainlength.click();
	    Assert.assertTrue(stone1.getAttribute("name").contains("stone"));
	    Select sel=new Select(stone1);
	    sel.selectByIndex(2);
	    
	    Assert.assertTrue(stone2.getAttribute("name").contains("stone"));
	    Select sel1=new Select(stone2);
	    sel1.selectByIndex(3);
	    
	    Assert.assertTrue(stone3.getAttribute("name").contains("stone"));
	    Select sel2=new Select(stone3);
	    sel2.selectByIndex(4);
	    
	    Assert.assertTrue(stone4.getAttribute("name").contains("stone"));
	    Select sel3=new Select(stone4);
	    sel3.selectByIndex(5);
	    
	    Assert.assertTrue(stone5.getAttribute("name").contains("stone"));
	    Select sel4=new Select(stone5);
	    sel4.selectByIndex(6);
	    	
	    Assert.assertTrue(fontcase.getAttribute("name").contains("fontType_1"));
	    Select sel5=new Select(fontcase);
	    sel5.selectByIndex(0);
	    
	    Assert.assertTrue(desiredtext.getAttribute("name").contains("text"));
	    desiredtext.sendKeys("Hi fi");
	    
	    Assert.assertTrue(zip.getAttribute("name").contains("zip"));
	    zip.sendKeys("5478");
	    
	    Assert.assertTrue(addtocart.getAttribute("class").contains("btn btn-primary"));
	    addtocart.click();
	    
	    
	    
	    
		
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	

}
