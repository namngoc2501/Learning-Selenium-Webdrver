package Buoi13_TestNG_TestAnotation2;

import org.testng.annotations.Test;

public class Attribute_Anotation_Test {
    // câu lệnh @Test thường đặt cho method dùng cho class
    //Nếu nó được đánh dấu cho Class thì tất cả các Method mà Public thì 
    //sẽ được run, các Method không phải public sẽ không được run.
	@Test(alwaysRun=true)
	public void firtMethod()
	{
		System.out.println("This is the first method");
	}
	//giá trị mặc định là true. Dùng để đánh dấu method run hoặc không run. 
	//Nếu false, method đó sẽ được bỏ qua, không run. 
	//Nếu true, method đó sẽ được run.
	@Test(enabled = false)
	public void secondMethod()
	{
		System.out.println("This is the second method");
	}
	
	@Test(description = "Print the third test method")
	public void thirdMethod()
	{
		System.out.println("This is the third method");
	}
	
	@Test(timeOut = 500)
	public void fourthMethod()
	{
		System.out.println("This is the fourth method");
	}
}
