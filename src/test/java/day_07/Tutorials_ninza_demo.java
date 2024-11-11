package day_07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Tutorials_ninza_demo {
	
	public static void main(String[] args) throws InterruptedException  {
		
		String error;
		ChromeDriver  driver  = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        
      
        driver.findElement(By.xpath("//button[@data-toggle='dropdown']/strong")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("EUR")).click();
        
        //canon eos and error msg
        driver.findElement(By.xpath("//div[@id='content']/div[2]/div[4]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.id("button-cart")).click();
        error = driver.findElement(By.xpath("//div[@id='product']/div[1]/div")).getText();
        System.out.println("select error = " + error);
        
        //iphone and success msg
        
        driver.findElement(By.linkText("Qafox.com")).click();
        driver.findElement(By.linkText("iPhone")).click();
        driver.findElement(By.id("input-quantity")).clear();
        driver.findElement(By.id("input-quantity")).sendKeys("2");
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(3000);
        String sucess=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
	    System.out.println("The sucess msg for iphone is"  +sucess);
        Thread.sleep(3000);
        
	    //@Errormsg for iphone and finding Ecotax,vat
        
	    driver.findElement(By.id("cart")).click();
        driver.findElement(By.xpath("//div[@id='cart']/ul/li[2]/div/p/a[1]/strong")).click();
        driver.findElement(By.xpath("//input[@value='2']")).clear();
        driver.findElement(By.xpath("//input[@value='2']")).sendKeys("3");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String ecotax = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]")).getText();
        System.out.println("Ecotax for iphone's is = " + ecotax);
        String vattax = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]")).getText();
        System.out.println("Vattax for iphone's is = " + vattax);
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        WebElement error1=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        if(error1.isDisplayed() && error1.isEnabled()) {
		System.out.println("the error msg for iphone quantity change is"  + error1.getText());
		}		
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.linkText("Laptops & Notebooks")).click();
        //@HP laptop
        driver.findElement(By.linkText("Show AllLaptops & Notebooks")).click();
        driver.findElement(By.linkText("HP LP3065")).click();
        driver.findElement(By.id("button-cart")).click();
        String sucess1=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println("the sucess msg for hp laptop is " +sucess1);
		
		//@coupon
		WebElement element1 = driver.findElement(By.xpath("//div[@id='top-links']/ul[1]//li[4]/a[1]"));
		driver.executeScript("arguments[0].click();", element1);
		driver.findElement(By.xpath("//div[@id='accordion']/div[1]/div[1]/h4[1]/a[1]")).click();
		driver.findElement(By.name("coupon")).sendKeys("ABCD123");	
		driver.findElement(By.id("button-coupon")).click();
		Thread.sleep(3000);
	    String error2=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    Thread.sleep(3000);
		System.out.println("the error msg after coupon code "  +error2);
		driver.findElement(By.className("close")).click();
		
		
       //@gift certificate
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(250));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='accordion']/div[3]/div[1]/h4/a")));
		driver.findElement(By.xpath("//div[@id='accordion']/div[3]/div[1]/h4/a")).click();
    	driver.findElement(By.name("voucher")).sendKeys("AXDFGH123");	
		driver.findElement(By.id("button-voucher")).click();
	    String error3= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    System.out.println("the error msg after gift certificate  is " +error3);
		
		//@clear both text box values
		driver.findElement(By.name("voucher")).clear();	
    	driver.findElement(By.xpath("//div[@id='accordion']/div[1]/div[1]/h4[1]/a[1]")).click();
    	Thread.sleep(3000);
		driver.findElement(By.name("coupon")).clear();	
		
	    //@checkout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
 	    //@register values
	 Thread.sleep(3000);
  	 driver.findElement(By.xpath("//input[@value='register']")).click();
  	 driver.findElement(By.xpath("//input[@value='Continue']")).click();
	 driver.findElement(By.name("firstname")).sendKeys("divya");
 	 Thread.sleep(3000);
  	 driver.findElement(By.name("lastname")).sendKeys("pusuluri");
  	 Thread.sleep(3000);
  	 driver.findElement(By.id("input-payment-email")).sendKeys("dummytest179@gmail.com");
  	 driver.findElement(By.name("telephone")).sendKeys("+18136665627");
  	 Thread.sleep(3000);
  	 driver.findElement(By.id("input-payment-password")).sendKeys("divya123");
 	 driver.findElement(By.id("input-payment-confirm")).sendKeys("divya123");
 	 driver.findElement(By.name("company")).sendKeys("Numpy ninza");
 	 Thread.sleep(3000);
 	 driver.findElement(By.name("address_1")).sendKeys("1223 old villageway oldsmar");
 	 Thread.sleep(3000);
 	 driver.findElement(By.name("city")).sendKeys("tampa");
	 driver.findElement(By.name("postcode")).sendKeys("33626");
	 Thread.sleep(3000);
   	 WebElement element2 = driver.findElement(By.name("country_id"));
   	 if(element2.isDisplayed() && element2.isEnabled()) {
   				element2.click(); 
   				
   	 }
   	 WebElement element3 = driver.findElement(By.xpath("//select[@id='input-payment-country']/option[240]"));
   	 if(element3.isDisplayed() && element3.isEnabled()) {
			element3.click(); 
			
   	 }		
  	 driver.findElement(By.id("input-payment-zone")).click();
  	Thread.sleep(4000);
  	 WebElement element4 = driver.findElement(By.xpath("//select[@id='input-payment-zone']/option[19]"));
  	 if(element4.isDisplayed() && element4.isEnabled()) {
  				element4.click(); 
  				Thread.sleep(4000);
  				driver.findElement(By.id("input-payment-zone")).click();
  	 }
     Thread.sleep(4000);
     WebElement element5 = driver.findElement(By.xpath("//input[@name='agree']"));
	 driver.executeScript("arguments[0].click();", element5);
  	 WebElement element6 = driver.findElement(By.xpath("//input[@id='button-register']"));
	 driver.executeScript("arguments[0].click();", element6);
	 Thread.sleep(5000);
	 WebElement element7 = driver.findElement(By.xpath("//input[@id='button-shipping-address']"));
	 driver.executeScript("arguments[0].click();", element7);
 	 driver.findElement(By.name("comment")).sendKeys("Make agift wrap for myorder");
  	 driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
 	 driver.findElement(By.name("comment")).sendKeys("Make a payment by cash on delivery");
  	 driver.findElement(By.name("agree")).click();
  	 driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
     driver.findElement(By.id("button-confirm")).click();
  	
  	 driver.close();
	
		
	}
	
}
