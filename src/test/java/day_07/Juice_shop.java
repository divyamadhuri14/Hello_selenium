package day_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;

public class Juice_shop {
	
	public static  ChromeDriver  driver  = new ChromeDriver();
        String url = "https://juice-shop.herokuapp.com/#/register";
         By dissmissbtn = By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span[1]/span");
         By email = By.id("emailControl");
         By password = By.id("passwordControl");
         By reaptpasswrd = By.id("repeatPasswordControl");
         
         By sqrtybox  = By.xpath("//div[@id='mat-select-value-1']");
         By sqrtyqusn = By.xpath("//mat-option[@id='mat-option-1']");
         By answr     = By.id("securityAnswerControl");
         By register =  By.xpath("//button[@id='registerButton']");
 public void Registration(){
	  
        	 driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	         driver.get(url);
	         driver.findElement(dissmissbtn).click();
	         driver.findElement(email).sendKeys("div123@gmail.com");
	         driver.findElement(password).sendKeys("madhu12");
	         driver.findElement(reaptpasswrd).sendKeys("madhu12");
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
             try {
             driver.findElement(sqrtybox).click();
             }
             catch (ElementClickInterceptedException e) {
 	 			// TODO Auto-generated catch block
 	        	 WebElement element1 =driver.findElement(sqrtybox);
 	             driver.executeScript("arguments[0].click();", element1);
 	             System.out.println("open squrity box");
 	         }
 	         
             
            driver.findElement(sqrtyqusn).click();
	         driver.findElement(answr).sendKeys("madhu");
	         try {
		         driver.findElement(register).click();	 			
	 		  }
	         catch (ElementClickInterceptedException e) {
	 			// TODO Auto-generated catch block
	        	 WebElement element2 =driver.findElement(register);
	             driver.executeScript("arguments[0].click();", element2);
	             System.out.println("Registration Successfull");
	         }
	         
	         
	         
	
	
}
  public static void main(String[] args) {
		
	  Juice_shop obj = new Juice_shop();		
	  obj.Registration();
		driver.close();
	}


    

  }
