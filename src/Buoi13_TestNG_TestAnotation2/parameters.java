package Buoi13_TestNG_TestAnotation2;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class parameters {
	@DataProvider(name="data-provider2")
	public Object[][] dataProviderMethod5(Method method)
	{
		Object [][] a =  new Object[][] {{"AAA", 111,true},{"BBB", 222,false}};
		return  a;
	}
}
