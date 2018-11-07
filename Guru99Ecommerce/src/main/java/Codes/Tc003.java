package Codes;
//Code to add 1000 items and den verify errors 


import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tc003 extends TC002 {
   @Test
	public void errorTest() {
		WebElement cart = driver.findElementByXPath("(//a[@title='Sony Xperia']/parent::h2/following::div[3]/child::button)");
		cart.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.findElementByPartialLinkText("Edit");
		
		WebElement edit = driver.findElementByLinkText("Edit");
		edit.click();
		//driver.findElementByXPath("//td[@class='product-cart-actions']/child::ul/child::*");
		WebElement quantity = driver.findElementById("qty");
		quantity.clear();
		quantity.sendKeys("1000");
		WebElement updateCart = driver.findElementByXPath("//button[@title='Update Cart']");
		updateCart.click();
		String text = driver.findElementByClassName("error-msg").getText();
		System.out.println(text);
//		String msgQty = ("The maximum quantity allowed for purchase is 500.");
//	    try {	    	
//	    	assertEquals(text, msgQty);
//		    } catch (Exception e) {
//		    	e.printStackTrace();	    	
//		    }	
	    WebElement emptyCart = driver.findElementByXPath("(//button[@title='Empty Cart'])");
	    emptyCart.click();
	    //String noItemsStg = ("You have no items in your shopping cart.\r\n" + 
	    	//	"Click here to continue shopping.");
	    String noItemsMsg = driver.findElement(By.xpath("//div[@class='cart-empty']")).getText();
	    System.out.println("You have no items msg = " + noItemsMsg);
	    
	    //try {	    	
    	//assertEquals(noItemsStg, noItemsMsg);
	   // } catch (Exception e) {
	   // 	e.printStackTrace();	    	
	   // }	
	      	   
	  }
	}

