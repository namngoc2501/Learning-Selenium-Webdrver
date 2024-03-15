package Buoi13_TestNG_TestAnotation2;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driven_Testing {

	//
	//1. Dataprovider ở cùng 1 class
	//
	
	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod()
	{
		//Đây là mảng 2 chiều, để có thể truyền danh sách dữ liệu vào trong
		Object [][] a = new Object[][] {{"data one 1", "data one 2"},{"data two 1", "data two 2"}};
		return  a;
	}
	
	@Test(dataProvider = "data-provider",  enabled = false)
	public void testMethod1(String [] data)
	{
		for(String a:data)
		{
			System.out.println("Data is: "+ a);
		}
		
	}
	
	//Nếu @DataProvider có sử dụng attribute name thì bạn phải điền đúng name ở Test nào bạn cần.
	//Còn nếu bạn không sử dụng attribute name thì bạn phải điền đúng tên method
	@DataProvider
	public Object[][] dataProviderMethod1()
	{
		Object [][] a = new Object[][] {{"data one 3", "data one 4"},{"data two 3", "data two 4"}};
		return  a;
	}
	
	@Test(dataProvider = "dataProviderMethod1", enabled = false)
	public void testMethod2(String [] data)
	{
		for(String a:data)
		{
			System.out.println("Data is: "+ a);
		}
		
	}
	
	
	//
	//Dataprovider với rẽ nhánh (if-else)
	//
	
	@DataProvider(name="data-provider1")
	public Object[][] dataProviderMethod2(Method method)
	{
		Object [][] a = null;
		if(method.getName().equals("testMethod3")) a = new Object[][] {{"data one 6", "data one 7"},{"data two 6", "data two 7"}};
		else if (method.getName().equals("testMethod4"))a = new Object[][] {{111, 222},{333, 444}};
		return  a;
	}
	
	@Test (dataProvider = "data-provider1",enabled = false)
	public void testMethod4(int data[])
	{	
		for(int a:data)
		{
			System.out.println("Data is: "+ a);
		}
	}
	
	//
	//1. Dataprovider ở cùng khác class
	//
	@Test (dataProvider = "data-provider2",dataProviderClass = parameters.class)
	public void testMethod5(Object data[])
	{
		System.out.println("Data is: "+ data[0] + ", number: "+data[1]+", condition: " + data[2]);
	}
}
