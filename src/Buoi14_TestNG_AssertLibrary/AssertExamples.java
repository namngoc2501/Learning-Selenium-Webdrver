package Buoi14_TestNG_AssertLibrary;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Initialization.Init2;

public class AssertExamples extends Init2{


	@Test(priority = 1)
    public void RunTest() throws Exception {

        String expectedTitle = "Anh Tester Automation Testing";
        String expectedTitle1 = "Anh Tester Automation Testing1111";
        String originalTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

      //Soft assert: Nếu sai chương trình vẫn tiếp tục chạy
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals(originalTitle, expectedTitle1);
        
        //hard assert: Nếu sai ngay lập tức chương trình sẽ được dừng
        Assert.assertEquals(originalTitle, expectedTitle);	
        Assert.assertTrue(driver.getTitle().contains("Anh Tester"));
        
        
    }
}
