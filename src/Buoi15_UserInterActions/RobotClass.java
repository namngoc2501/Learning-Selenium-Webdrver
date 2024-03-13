package Buoi15_UserInterActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Initialization.Init2;

public class RobotClass extends Init2{

	
	@Test
	public void InputDataSearch() throws AWTException
	{
		driver.get("https://anhtester.com/blogs");
		
		WebElement inputCourseElement = driver.findElement(By.xpath("//input[@placeholder='Tìm kiếm khóa học . . .']"));
		inputCourseElement.click();
		//Nhập dữ liệu theo cấu hình bàn phím của máy
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_G);
		
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
}
