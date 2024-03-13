package Buoi15_UserInterActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Initialization.Init2;

public class ActionsClass extends Init2{

	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.google.com/");
	}
	@Test(enabled = false)
	public void TestAction() throws InterruptedException
	{
		WebElement input = driver.findElement(By.xpath("//div[@class='SDkEP']"));
		
		//Actions
		Actions actions = new Actions(driver);
		//Sendkeys
		actions.sendKeys(input,"Anh Tester").build().perform();
		
		//Click button Enter
		actions .sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		WebElement anhTesterTitleElement = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]"));
		anhTesterTitleElement.click();
		
		//Double Click
		Thread.sleep(2000);
		WebElement headerHomePage = driver.findElement(By.className("section__title"));
		actions.doubleClick(headerHomePage).build().perform();
		
		//Move to Element 
		WebElement btnAllcourses = driver.findElement(By.xpath("//a[contains(text(),'Tất Cả Khóa Học')]"));
		actions.moveToElement(btnAllcourses).build().perform();
		
		//Context Click(Click chuột phải)
		actions.contextClick(btnAllcourses).build().perform();
	}
	@Test
	public void dragAndDrop() throws Exception
	{
		  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		  Thread.sleep(1);

		  //Cách 1
		  // Bắt element cần kéo
		  WebElement From = driver.findElement(By.xpath("//div[@id='box6']"));
		  // Bắt element cần thả đến
		  WebElement To = driver.findElement(By.xpath("//div[@id='countries']//div[1]"));

		  Thread.sleep(1);
		  Actions action = new Actions(driver);
		  // Kéo và thả
		  action.dragAndDrop(From, To).build().perform();
		  
		  Thread.sleep(1);
		  
		  //Cách 2
		  //Bắt element cần kéo 
		  WebElement From1 = driver.findElement(By.xpath("//div[@id='box7']"));
		  // Bắt element cần thả đến
		  WebElement To1 = driver.findElement(By.xpath("//div[@id='box103']"));
		  
		  action.clickAndHold(From1).build().perform();
		  action.moveToElement(To1).build().perform();
		  action.release(To1).build().perform();

		  Thread.sleep(1);
	}
}
