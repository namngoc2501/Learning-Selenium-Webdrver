package Buoi7_LocatorWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator{

	public static void main(String[] args) throws Throwable   {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://anhtester.com");
		Thread.sleep(2000);
		
		
		
		//Click button login
		WebElement button_login = driver.findElement(By.id("btn-login"));
		button_login.click();
		//Input data	
		WebElement email = driver.findElement(By.name("email"));
	    //
	    WebElement password = driver.findElement(By.name("password"));
		email.sendKeys("namngoc25@gmail.com");
		password.sendKeys("Mitthanthanh2501");
		
		
		//Click link text
		WebElement linktext_Contact = driver.findElement(By.linkText("CONTACT"));
		linktext_Contact.click();		
		Thread.sleep(2000);
		
		WebElement tagNameDiv = driver.findElement(By.tagName("div"));
	    //
		System.out.println(tagNameDiv.getText());
		Thread.sleep(2000);
		
		WebElement buttonCSSSelector = driver.findElement(By.cssSelector("#style-7 > section.feature-area.padding-bottom-90px > div > div > div.row > div.col-lg-12 > a > img"));
		buttonCSSSelector.click();
		
		driver.quit();		

	}

}
