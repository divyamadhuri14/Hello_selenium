package Assignment_test;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sause_demo {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		
		try {
		    Thread.sleep(10000); // Sleep for 10000 milliseconds (10 second)
		} catch (InterruptedException e) {
		    // Handle the interruption if needed
		    System.out.println("Thread interrupted: " + e.getMessage());
		}
		
		WebElement Addtocart1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		Addtocart1.click();
		
		WebElement Addtocart2 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
		Addtocart2.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Gotocart = driver.findElement(By.id("shopping_cart_container"));
		Gotocart.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Checkout = driver.findElement(By.name("checkout"));
		Checkout.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Firstname = driver.findElement(By.id("first-name"));
		Firstname.sendKeys("madhu");
		
		WebElement Lastname = driver.findElement(By.id("last-name"));
		Lastname.sendKeys("pusuluri");
		
		WebElement Zipcode = driver.findElement(By.id("postal-code"));
		Zipcode.sendKeys("34677");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();
        
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement Finish = driver.findElement(By.id("finish"));
        Finish.click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement Backhome = driver.findElement(By.id("back-to-products"));
        Backhome.click();
        
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement Home = driver.findElement(By.id("react-burger-menu-btn"));
        Home.click();
        
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement Logout = driver.findElement(By.id("logout_sidebar_link"));
        Logout.click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.close();		
		
	}

}
