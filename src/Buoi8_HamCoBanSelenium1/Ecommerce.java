package Buoi8_HamCoBanSelenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\webdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.activeitzone.com/ecommerce/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Email, Password, and button Login
		WebElement email_login = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_login = driver.findElement(By.name("password"));
		WebElement button_login= driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		//Action
		
			//Clear()
		email_login.clear();
			//sendkeys()
		email_login.sendKeys("admin@example.com");
		    //Clear()
		password_login.clear();
		    //sendkeys()
		password_login.sendKeys("123456");
			//submit()
		button_login.submit();
//		button_login.click();
		
		//HomepageSetting
		WebElement homepageSetting_link = driver.findElement(By.partialLinkText("Homepage Settin"));
			//Click()
		homepageSetting_link.click();;
		
		
		//Header Homepage
		WebElement header_title = driver.findElement(By.xpath("//h1[contains(text(),'Homepage Settings (Classic)')]"));
		
			//isDisplayed	
		boolean isDisplayedHeader = header_title.isDisplayed();
		if(isDisplayedHeader == true)
		{
			System.out.println("Đã đến trang HomePage");
		}
		
		//Button Save
			//isEnabled()
		boolean isEnabledButonSave = driver.findElement(By.tagName("button")).isEnabled();
		if(isEnabledButonSave)
		{
			driver.findElement(By.tagName("button")).click();
		}
		else
		{
			System.out.println("Không click được");
		}
		
		
		
		
		//Order Page
		WebElement orderPage_link = driver.findElement(By.linkText("Orders"));
		if(orderPage_link.isEnabled())
		{
			orderPage_link.click();
		}
		
		WebElement order_checkbox = driver.findElement(By.linkText("Orders"));
			//isSelected()
		if(!order_checkbox.isSelected());
		{
			order_checkbox.click();
			System.out.println("CheckBox is selected");
			//GetText()
			System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'All Orders')]")).getText());
			//GetTagName()
			System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'All Orders')]")).getTagName());
			//GetTagName()
			System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'All Orders')]")).getCssValue("color"));
			//GetTagName()
			System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'All Orders')]")).getAttribute("name"));
			//GetTagName()
			System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'All Orders')]")).getSize());
			//GetLocation()
			org.openqa.selenium.Point point = driver.findElement(By.xpath("//h5[contains(text(),'All Orders')]")).getLocation();
			System.out.println(point.getX() + point.getY());
		}
		
		//
		System.out.println("Mission is completed");
		Thread.sleep(5000);
		driver.quit();

	}

}
