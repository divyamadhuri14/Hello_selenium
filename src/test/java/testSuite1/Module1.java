package testSuite1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Module1 {
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("i am executingbefore all methods");

	}
	@Test
	public void test001() {
		
		System.out.println("i am executing test case 001");
	}
	@Test
	
   public void test002() {
		
		System.out.println("i am executing test case 002");
	}
	@Test
   public void test003(){
	
	System.out.println("i am executing test case 003");
}
	@AfterMethod
	  public void afterMethod() {
		System.out.println("i am executing after all methods");

	}
	
	
    @DataProvider
    
    public Object[][] data001(){
    	
    	Object[][] data= {{"madhu" , "passcode1"},{"sri"	,"passcode2"}};
    	
    	return data;
    }
    	
    	@Test(dataProvider = "data001")
    	
    	public void login(String username, String password) {
    		System.out.println(username +"and"+ password);
    		
    		
    		
    	}
    	
    		
}
    

