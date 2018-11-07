package Codes;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC001 extends TC002 {
	ChromeDriver driver;
	@Test
	public  void runtest() throws InterruptedException{
//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");


//	driver.get("http://live.guru99.com/");
//	driver.manage().window().maximize();
//	String homeTitle = driver.getTitle();
//	//if(homeTitle=="Home Page") {
//		System.out.println("The Title of current page is "+homeTitle);
//	//}
//	WebElement mobile = driver.findElementByLinkText("MOBILE");
//	mobile.click();
// String Mobile = driver.getTitle();
// System.out.println("The Title of current page is "+Mobile);
 WebElement sort = driver.findElementByXPath("(//select[@title='Sort By'])");
 Select dropdown = new Select(sort);

 dropdown.selectByVisibleText("Name");
 
 List<WebElement> phones = driver.findElementsByClassName("product-name");
 for(WebElement phonename:phones) {
	System.out.println(phonename.getText()); 
 }
 
 
 try {
	 int i =1;
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./snaps/snap"+i+".jpg"));
	} catch (WebDriverException e) {
		System.out.println("The browser has been closed.");
	} catch (IOException e) {
		System.out.println("The snapshot could not be taken");
	}
 driver.close();
}}
