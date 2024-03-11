package Buoi10_RadiobuttonCheckboxDropdown;

import java.util.List;

import org.openqa.selenium.WebElement;

import Initialization.*;
import dev.failsafe.internal.util.Assert;

public class Handle_CheckBox {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Set up
		Init.setUp("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		//Handle checkbox
		 //
		 // --------------- Sigle Checkbox-------------
		 //
//		WebElement checkBox1 = Init.getWebelementXpath("//input[@id='isAgeSelected']");
//		WebElement checkBox2 = Init.getWebelementXpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/label[2]/input[1]");
//		if(checkBox1.isSelected())
//		{	
//			System.out.println("Checkbox selection is: "+ checkBox1.isSelected());
//			System.out.println("Checkbox is selected");
//		}
//		else
//		{
//			checkBox1.click();
//			WebElement text = Init.getWebelementXpath("//div[@id='txtAge']");
//			if(text.isDisplayed()) 
//			{
//				System.out.println("Checkbox selection has been just selected");
//				System.out.println(text.getText());
//			}
//			System.out.println("Checkbox selection is "+ checkBox1.isSelected());
//		}
		//
		// --------------- Multi Checkbox-------------
		//
			//Click button "Check ALL"
			WebElement buttonCheckALL = Init.getWebelementXpath("//input[@id='check1']");
			if(buttonCheckALL.getDomProperty("value").toLowerCase().equals("check all")) buttonCheckALL.click();
			if(buttonCheckALL.getDomProperty("value").toLowerCase().equals("uncheck all")) 
			{
				System.out.println("Checking All items is successful");
			}
		
		
			// Checking selection of checkboxes in the group
			// Method 1
			for(int i = 1;i<=4;i++)
			{
				String XpathCheckbox = "//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div["+i+"]/label[1]/input[1]";
				WebElement Checkbox = Init.getWebelementXpath(XpathCheckbox);
				if(Checkbox.isSelected())
				{
					System.out.println("The CheckBox "+ i + " is Selected");
				}
				else
				{
					System.out.println("The CheckBox "+ i + " is not Selected");
				}
			}
		
		
			//Method 2
			List<WebElement> listCheckboxs = Init.getWebelementsCssSelector("checkbox");
			System.out.println("The CheckBoxs "+ listCheckboxs.size());
			for(int i =0; i< listCheckboxs.size();i++)
			{
				
				if(i == 4)
				{
					listCheckboxs.get(i).click();
					System.out.println("The CheckBox at "+ i +" position" + " is Selected");
					
				}
				else if(i==6)
				{
					listCheckboxs.get(i).click();
					System.out.println("The CheckBox at "+ i +" position" + " is Selected");
				}
			}
		
		//Tear down
		Init.tearDown();
	}

}
