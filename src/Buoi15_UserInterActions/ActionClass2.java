package Buoi15_UserInterActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Initialization.Init2;

public class ActionClass2 extends Init2{

	@Test(enabled = false)
	public void inputTextUperCase() throws Exception
	{
		driver.get("https://www.google.com/");

		WebElement element = driver.findElement(
				By.xpath("//textarea[@id='APjFqb']"));

		Actions action = new Actions(driver);

		// Đè giữ phím SHIFT và nhập text -> Chữ in hoa
		action.keyDown(element, Keys.SHIFT).sendKeys("anh tester").build().perform();

		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test (enabled = false)
	public void ScrollPage() throws InterruptedException {
		driver.get("https://anhtester.com/");

		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		// Scroll down
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		// Scroll up
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();

		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void copyAndPaste() throws InterruptedException {
		driver.get("https://anhtester.com/blogs");

		Actions action = new Actions(driver);
		
		//Lấy WebElement
		WebElement inputCourseElement = driver.findElement(By.xpath("//input[@placeholder='Tìm kiếm khóa học . . .']"));
		WebElement inputBlogElement = driver.findElement(By.xpath("//input[@placeholder='Tìm kiếm bài viết . . .']"));
		
		//Nhập dữ liệu vào ô Search Course
		Thread.sleep(1);
		inputCourseElement.sendKeys("Automation Testing");
		
		//Crtl + a để bôi đen
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//Ctrl + c để copy
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		// Move sang Element khác	
		action.moveToElement(inputBlogElement).build().perform();
		action.click(inputBlogElement).build().perform();
		
		//Crtl + v để dán
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//Làm mới trang
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
	}
	
}
