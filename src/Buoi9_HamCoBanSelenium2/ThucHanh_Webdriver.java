package Buoi9_HamCoBanSelenium2;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThucHanh_Webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Set Up
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium\\\\webdriver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.activeitzone.com/ecommerce/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();

		// Email, Password, and button Login
		WebElement email_login = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_login = driver.findElement(By.name("password"));
		WebElement button_login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		// Action

		// Clear()
		email_login.clear();
		// sendkeys()
		email_login.sendKeys("admin@example.com");
		// Clear()
		password_login.clear();
		// sendkeys()
		password_login.sendKeys("123456");
		// submit()
		button_login.submit();
//				button_login.click();

		// HomepageSetting
		WebElement homepageSetting_link = driver.findElement(By.partialLinkText("Homepage Settin"));
		// Click()
		homepageSetting_link.click();
		;

		// Order Page
		WebElement orderPage_link = driver.findElement(By.linkText("Orders"));
		orderPage_link.click();

		//Nội dung bài học--------------------------------------------------------------------------
		// findElements()---------------------------------------------------------------------------
		List<WebElement> option = driver.findElements(By.xpath("//body/div[1]/div[2]/div[1]"));
		for (int i = 0; i < option.size(); i++) {
			System.out.println(option.get(i).getText());
		}
		
		
		//Basic Browser Operations-----------------------------------------------------------------
		// Navigate to a page
		driver.navigate().to("http://anhtester.com");

		// Điều hướng về lịch sử trang trước đó
		driver.navigate().back();

		// Làm mới trang hiện tại
		driver.navigate().refresh();

		// Điều hướng đến trang tiếp sau
		driver.navigate().forward();

		// Get the title of the page
		String title = driver.getTitle();
		// Get the current URL
		String url = driver.getCurrentUrl();
		// Get the current page HTML source
		String html = driver.getPageSource();
		
//		System.out.println(title + " " + url );
		
		//Basic Browser Operations-----------------------------------------------------------------
		//Lấy định danh tab trình duyệt hiện tại đang ở
		 String indentification = driver.getWindowHandle();
		// Open a new tab (mở 1 tab mới từ trình duyệt cũ và chuyển qua đó)
		driver.switchTo().newWindow(WindowType.TAB);
		
		// Opens a new window and switches to new window(Mở một trình duyệt mới và chuyển sang trình duyệt đó)
		driver.switchTo().newWindow(WindowType.WINDOW);		
		//đóng trình duyệt mới mở
		driver.switchTo().newWindow(WindowType.WINDOW).close();
		
		//Chuyển về tab trình duyệt cũ
		driver.switchTo().window(indentification) ;
		
		//Lấy tất cả định danh các tab đang mở
		Set<String> listTabs = driver.getWindowHandles();
		driver.switchTo().window(listTabs.toArray()[1].toString()) ;
		
		//Handle Alert
//		driver.switchTo().alert();
		
		//Iframe
		
		driver.navigate().to("https://www.w3schools.com/html/html_iframe.asp");
		// Switch to Frame
		
		driver.switchTo().frame("cnftComm");//Đến khung hiển thị theo tên
//		driver.switchTo().frame(1);//Đến khung hiển thị đầu
		
//		WebElement element = driver.findElement(By.id("adg-0-sync"));
//		driver.switchTo().frame(element); //Chuyển đến khung hiển thị chứa element có ID chỉ định

		// Chuyển sang khung hiển thị trên trình duyệt hiện tại
//		driver.switchTo().defaultContent();
		
		//
		System.out.println("----Mission is completed----");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
