package Buoi13_TestNG_TestAnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_Anotation_LoginPage extends BaseTest1 {

	@BeforeMethod
	public void beforeLogin() {
		WebElement btn_Login = driver.findElement(By.xpath("//a[@id='btn-login']"));
		btn_Login.click();
		if (driver.getCurrentUrl().equals("https://anhtester.com/login")) {
			System.out.println("BeforeMethod");
		} else {
			driver.navigate().to("https://anhtester.com/login");
			System.out.println("Please check again, Somethings has been wrong");
		}
	}

	@Test(priority = 0)
	public void inputUsername() throws InterruptedException {
		WebElement input_Username = driver.findElement(By.xpath(
				"//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));


		input_Username.sendKeys("namngoc2501@gmail.com");

		
		System.out.println("Test priority 0");
	}

	@Test(priority = 1)
	public void inputPassword() {
		WebElement input_Password = driver.findElement(By.xpath(
				"//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		input_Password.sendKeys("Mitthanthanh2501");
		System.out.println("Test priority 1");

	}
	
	@Test (priority = 2)
	public void clickButtonSubmit() throws Exception
	{
		WebElement btn_Submit = driver.findElement(By.xpath("//button[@id='login']"));
		Thread.sleep(3000);
		btn_Submit.submit();
		System.out.println("Test priority 2");

	}

	@AfterMethod
	public void afterLogin() {
		System.out.println("After Method");

	}

}
