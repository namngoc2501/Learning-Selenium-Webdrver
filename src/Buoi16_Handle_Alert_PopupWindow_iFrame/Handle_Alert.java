package Buoi16_Handle_Alert_PopupWindow_iFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Initialization.Init2;

public class Handle_Alert extends Init2 {

	@Test
	public void alertDemo() throws Exception {
		Thread.sleep(2000);
		// move on to the website
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		// Get Webelement of the button which show Alert
		WebElement btn_ShowAlert = driver
				.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']"));
		btn_ShowAlert.click();

		Thread.sleep(2000);
		// Create an Alert variable
		Alert alert = driver.switchTo().alert(); // Move on to the Alert

		// Get message from the Alert
		String message = alert.getText();
		System.out.println(message);

		//Sendkeys Alert
		Thread.sleep(2000);
		alert.sendKeys("NamVipPro2024");
		Thread.sleep(2000);
		
		// Accept Alert (Click on the ok button)
		alert.accept();
		Thread.sleep(2000);
		String textResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/p[3]")).getText();
		
		Assert.assertEquals(textResult,"You have entered 'NamVipPro2024' !");
//		/////////////////////////////////////////////////////////////////////////////////////
//		driver.navigate().to("https://www.demo.guru99.com/test/delete_customer.php");
//
//		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("NamVipPro2024");
//		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).click();
//
//		// Get message from the Alert
//		String message1 = alert.getText();
//		System.out.println(message1);
		
//		// Accept Alert (Click on the ok button)
//		alert.accept();

	}
}
