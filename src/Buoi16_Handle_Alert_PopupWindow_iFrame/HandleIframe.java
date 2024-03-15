package Buoi16_Handle_Alert_PopupWindow_iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Initialization.Init2;

public class HandleIframe extends Init2 {

	@Test(enabled = false)
	public void IframeDemoID() throws Exception {
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);
//		
		Actions action = new Actions(driver);
//		
//		//Example of Switching to iframe through ID:
		int frameTotal = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameTotal);

		WebElement title = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		action.scrollToElement(title).build().perform();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html[1]/body[1]/a[1]/img[1]")).click();
	}

	@Test(enabled = false)
	public void IframeMainDemo() throws Exception {
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		// Câu lệnh này dùng sau khi tương tác với 1 frame nằm trong 1 frame khác
		// Khi không muốn tương tác với frame đó nữa bạn chuyển về frame cha bao ngoài
		// frame con đó
		driver.switchTo().parentFrame();
		System.out.println(driver.switchTo().parentFrame().toString());
		// Câu lệnh này chuyển từ frame đang tương tác sang chang chính
		driver.switchTo().defaultContent();
		System.out.println(driver.switchTo().defaultContent().toString());
	}

	@Test(enabled = true)
	public void IframeNIDNWM() throws Exception {
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		int size = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i < size; i++) {
			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
			if(total == 1)
			{ 
				driver.switchTo().frame(i);
				System.out.println("********We are switched to the iframe*******");
				driver.findElement(By.xpath("html/body/a/img")).click();
				
				//Clicking the element in line with Advertisement
			    System.out.println("*********We are done***************");
			    driver.switchTo().defaultContent();
			    
			}
		}
	}

}
