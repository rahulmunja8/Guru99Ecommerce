package Codes;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test

public class TC002 {
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://live.guru99.com/");
		driver.manage().window().maximize();
		String homeTitle = driver.getTitle();
		//if(homeTitle=="Home Page") {
			System.out.println("The Title of current page is "+homeTitle);
		//}
			
			WebElement mobile = driver.findElementByLinkText("MOBILE");
			mobile.click();
		 String Mobile = driver.getTitle();
		 System.out.println("The Title of current page is "+Mobile);
		
	}
//	@Test
//	public void TCDay2() {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement Sony = driver.findElementByXPath("(//a[@title='Sony Xperia'])");
//		WebElement priceSony = driver.findElementByXPath("(//a[text()='Sony Xperia']/parent::h2/../div/span/span)");
//		String PriceOfSony = priceSony.getText();
//		System.out.println(PriceOfSony);
//		Sony.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String Product = driver.findElementByClassName("product-name").getText();
//		System.out.println(Product);
//		String price = driver.findElementByClassName("regular-price").getText();
//		System.out.println(price);
//	}
	
	
 

}
