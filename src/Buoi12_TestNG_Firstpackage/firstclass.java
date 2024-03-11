package Buoi12_TestNG_Firstpackage;

import org.testng.annotations.Test;

//Dùng từ khoá @Test tại đây file xml sẽ không tính class là một trường hợp thử nghiệm
public class firstclass {

	@Test // câu lệnh @Test thường đặt cho method dùng cho class
	
	public void firtMethod()
	{
		System.out.println("This is the first method of the FirstClass in FirstPackage");
	}
	
	@Test
	public void secondMethod()
	{
		System.out.println("This is the second method of the FirstClass in FirstPackage");
	}
}
