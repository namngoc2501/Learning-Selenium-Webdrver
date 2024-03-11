package Buoi10_RadiobuttonCheckboxDropdown;

import org.openqa.selenium.WebElement;

import Initialization.Init;

public class Handle_RadioButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Setup
		Init.setUp("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		//
		//Single RadioButton
		//
		WebElement radioButton_Male = Init.getWebelementXpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]");
		WebElement radioButton_Female = Init.getWebelementXpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[2]");
		//Male
		if(radioButton_Male.isSelected()) System.out.println("Radio Button 'Male' is selected");
		
		else
		{
			System.out.println("Radio Button 'Male' is not selected");
			radioButton_Male.click();
			System.out.println("Radio Button 'Male' has been just selected");
		}
		//Female
		if(radioButton_Female.isSelected()) System.out.println("Radio Button 'Male' is selected. Somethings Wrong with RadioButton");
		else
		{
			System.out.println("Radio Button 'Female' is not selected");
		}
		
		
		//
		//Multiple RadioButton
		//
		WebElement radioButton_Male1 = Init.getWebelementXpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]");
		WebElement getValueButton = Init.getWebelementXpath("//button[contains(text(),'Get values')]");
		WebElement radioButton_5to15 = Init.getWebelementXpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[2]");
		WebElement textResult  = Init.getWebelementXpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/p[2]");
		
		radioButton_Male1.click();
		radioButton_5to15.click();
		getValueButton.click();
		System.out.println(textResult.getText());
		if(textResult.getText().contains("Age group: 5 - 15"))
		{
			System.out.println("Radio Button '5 to 15' is selected");

		}
		if(textResult.getText().contains("Sex : Male"))
		{
			System.out.println("Radio Button 'Male	' is selected");
		}
		//Teardown
		Init.tearDown();
	}

}
