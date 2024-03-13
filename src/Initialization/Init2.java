package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Init2 {
	public static WebDriver driver;
//	public static WebDriverWait wait; 
	
	@BeforeTest
	public void setUp() throws Exception
	{
		// TODO Auto-generated method stub
		// Set Up
		System.setProperty("webdriver.chrome.driver",
						"D:\\\\Selenium\\\\webdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		Thread.sleep(2000);
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterTest
	//TearDown
	public void tearDown() throws Exception
	{
		System.out.println("----Mission is completed----");
		Thread.sleep(5000);
		driver.quit();
	}
}
