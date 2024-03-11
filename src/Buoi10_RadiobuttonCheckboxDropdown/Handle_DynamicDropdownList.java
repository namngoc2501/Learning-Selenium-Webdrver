package Buoi10_RadiobuttonCheckboxDropdown;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Initialization.Init;

public class Handle_DynamicDropdownList extends Init{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		setUp("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
		
			
		//Dynamic Dropdown----------------------------------------------------------------------
		Thread.sleep(2000);
		WebElement Button = driver.findElement(By.xpath("//span[normalize-space()='Select a Country']"));
		System.out.println(Button.isEnabled());
		Button.click();
		
		getWebelementXpath("/html[1]/body[1]/section[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]").sendKeys("Vietnam");
		
		
		
		//Handle keyboard
		//Khai báo đối tượng thuộc lớp action để handle trực tiếp keyboard của bàn phím máy tính
		//Thư viện action này của Selenium
		Actions actions = new Actions(driver);
		
		//Hàm build để xây dựng hành động cho action, hàm perform xác nhận xây dựng đó.
		actions.sendKeys(Keys.ENTER).build().perform();
		
		//Robot này của Java
		Robot robot = new Robot();
		
		//Teardown
		tearDown();
		
		

	}
	

}
