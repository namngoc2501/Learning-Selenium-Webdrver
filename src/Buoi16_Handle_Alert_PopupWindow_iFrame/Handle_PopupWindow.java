package Buoi16_Handle_Alert_PopupWindow_iFrame;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Initialization.Init2;

public class Handle_PopupWindow extends Init2 {

	@Test
	public void PopupWindowDemo() throws Exception {
		driver.get("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
		// Lưu lại mã cửa sổ window đầu tiên
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);

		// Open new window
		driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']")).click();
		Thread.sleep(2000);
		// Get all new opened window.

		Set<String> windows = driver.getWindowHandles();

		// ArrayList thì giá trị được trùng còn Set thì không
		// Set là một collection không thể chứa các phần tử trùng lặp
		// Cách duyệt từng phần tử trùng lặp trong collection (Set)

		for (String window : windows) {
			if (!mainWindowHandle.equalsIgnoreCase(window)) {
				System.out.println(window);
				// So sánh các cửa sổ mới, cửa sổ nào khác với cửa sổ đầu tiên thì chuyển tới.
				// Thao tác được
				// Switch to Child window
				driver.switchTo().window(window);
				driver.manage().window().maximize();
				Thread.sleep(2000);

				System.out.println(driver.getCurrentUrl());

				//
				driver.findElement(By.xpath(
						"//span[@class='css-1qaijid r-dnmrzs r-1udh08x r-3s2u2q r-bcqeeo r-qvutc0 r-poiln3']//span[@class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3'][contains(text(),'Đăng nhập')]"))
						.click();

				driver.close();
			}

		}

	}
}
