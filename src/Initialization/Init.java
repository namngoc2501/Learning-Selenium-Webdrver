package Initialization;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Init {

	public static WebDriver driver;
	public static WebDriverWait wait; 
	
	
	public static void setUp(String url) throws Exception
	{
		// TODO Auto-generated method stub
		// Set Up
		System.setProperty("webdriver.chrome.driver",
						"D:\\\\Selenium\\\\webdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		Thread.sleep(2000);
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	//
	//Get A Weblement
	//
	
	//By Xpath
	public static WebElement getWebelementXpath(String Xpath)
	{
		return driver.findElement(By.xpath(Xpath));
		
	}
	//By ID
	public static WebElement getWebelementID(String ID)
	{
		return driver.findElement(By.id(ID));
		
	}
	//By Name
	public static WebElement getWebelementName(String Name)
	{
		return driver.findElement(By.name(Name));
		
	}
	//By Class
	public static WebElement getWebelementClass(String Class)
	{
		return driver.findElement(By.className(Class));
		
	}
	//By Lintext
	public static WebElement getWebelementLinktext(String Linktext)
	{
		return driver.findElement(By.linkText(Linktext));
		
	}
	//By Lintext
		public static WebElement getWebelementCssSelector (String CssSelector )
		{
			return driver.findElement(By.cssSelector(CssSelector));
			
		}
	
	//
	//Get A List Of Webelements
	//
	
	//By CssSelector
	public static List<WebElement> getWebelementsCssSelector(String cssSelector)
	{
		return driver.findElements(By.cssSelector("[type = '"+cssSelector+"']"));	
	}
	//By CssSelector
	public static List<WebElement> getWebelementsID(String ID)
	{
		return driver.findElements(By.id(ID));	
	}
	//By CssSelector
	public static List<WebElement> getWebelementsXpath(String xPath)
	{
		return driver.findElements(By.xpath(xPath));	
	}
	//TearDown
	public static void tearDown() throws Exception
	{
		System.out.println("----Mission is completed----");
		Thread.sleep(5000);
		driver.quit();
	}
	

}
