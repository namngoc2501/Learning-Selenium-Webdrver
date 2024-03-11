package Buoi10_RadiobuttonCheckboxDropdown;

import java.util.List;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Initialization.Init;
import dev.failsafe.internal.util.Assert;


public class Handel_DropdownList extends Init{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		setUp("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		
		//Static Dropdown----------------------------------------------------------------------
		Select select= new Select(getWebelementXpath("//select[@id='select-demo']"));
		
		//Visible text
		select.selectByVisibleText("Sunday");
		Thread.sleep(2000);
		//Index (Starting from 0 value)
		select.selectByIndex(5);
		Thread.sleep(2000);
		//Value
		select.selectByValue("Saturday");
		Thread.sleep(2000);
		
		//Check Multiple of the dropdown list
		if(select.isMultiple()) System.out.println("The dropdown list is multiple");
		else  System.out.println("The dropdown list is not multiple");
		
		//Checking how many values on the dropdown list
		System.out.println("The items of the dropdownlist is "+ select.getOptions().size());
		
		//Getting the first Option
		
		if(select.getFirstSelectedOption().getText().equals("Saturday"))
		{
			System.out.println("The option selected currently is "+ select.getFirstSelectedOption().getText());
		}
		
		//Get All Options
		List<WebElement> listOptions = select.getOptions();
		for(int i =0;i<listOptions.size();i++)
		{
			System.out.println(i +" "+listOptions.get(i).getAttribute("value"));
		}
			
		//Dynamic Dropdown----------------------------------------------------------------------
		driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
		Select select1 = new Select(getWebelementXpath("//body/section[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]"));
		select1.selectByVisibleText("Vietnam");
		//Teardown
		tearDown();

	}
	
}
