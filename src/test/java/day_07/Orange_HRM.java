package day_07;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Orange_HRM {
	
	public static  ChromeDriver  driver  = new ChromeDriver();
	
	
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
     By username = By.name("username");
     By password = By.name("password");
     By login = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	 By myinfo = By.xpath("//span[text()='My Info']");
     By contactdetails = By.linkText("Contact Details");
	 By street1 = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
	 By street2 = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input");
	 By city = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input");
	 By state = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input");
	 By zipcode = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input");
	 By country = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");		
	 By countryname = By.xpath("//div[@class='oxd-select-text-input']");
	 By home = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input");
	 By mobile = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input");
	 By otheremail = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input");
	 By save = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
public void login(){
	
	
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get(url);
	driver.findElement(username).sendKeys("Admin");
	driver.findElement(password).sendKeys("admin123");
	driver.findElement(login).click();
	driver.findElement(myinfo).click();
	driver.findElement(contactdetails).click();
	driver.findElement(street1).sendKeys("1223");
	driver.findElement(street2).sendKeys("oldvillageway");
	driver.findElement(city).sendKeys("olsmar");
	driver.findElement(state).sendKeys("fl");
	driver.findElement(zipcode).sendKeys("34677");
	driver.findElement(country ).click();
    driver.findElement(countryname ).click();
	driver.findElement(home).sendKeys("81355557");
	driver.findElement(mobile ).sendKeys("4488829929");
	driver.findElement(otheremail).sendKeys("sskkg12@gmail.com");
	driver.findElement(save).click();
	
	
}
	
	 public static void main(String[] args) {
			
		 Orange_HRM obj = new Orange_HRM();		
		  obj.login();
			driver.close();
		

	
    }
}