package Buoi11_TestNG;

import org.testng.annotations.Test;

import Initialization.Init;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Automation_TestNG extends Init {
	@Test
	public void f() throws InterruptedException {
		WebElement dynamicDropdown = getWebelementXpath("//span[normalize-space()='Select a Country']");
		dynamicDropdown.click();
		
		WebElement dynamicInputDropdown = getWebelementXpath(
				"/html[1]/body[1]/section[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]");
		dynamicInputDropdown.sendKeys("VietNam");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		
	}

	@BeforeTest
	public void beforeTest() throws Exception{
		setUp("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
	}

	@AfterTest
	public void afterTest() throws Exception {
		tearDown();
	}

}
