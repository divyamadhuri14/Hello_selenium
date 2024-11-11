package day_07;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Browser_stack {
	
	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://bstackdemo.com/signin");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(350));
    driver.findElement(By.xpath("//div[@id='username']/div")).click();
    driver.findElement(By.xpath("//div[@id='react-select-2-option-0-0']")).click();
    
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(350));
    driver.findElement(By.xpath("//div[@id='password']/div/div")).click();
    driver.findElement(By.xpath("//div[@id='react-select-3-option-0-0']")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(350));
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//div[@id='1']/div[4]")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//div[@id='2']/div[4]")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//div[@id='5']/div[4]")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
    driver.findElement(By.xpath("//div[@class='buy-btn']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(350));
    driver.findElement(By.xpath("//input[@id='firstNameInput']")).sendKeys("divya");
	
	driver.findElement(By.xpath("//input[@id='lastNameInput']")).sendKeys("pusuluri");
	
    driver.findElement(By.xpath("//input[@id='addressLine1Input']")).sendKeys("1223 oldvillageway, oldsmar");
	
	driver.findElement(By.xpath("//input[@id='provinceInput']")).sendKeys("florida");
	
    driver.findElement(By.xpath("//input[@id='postCodeInput']")).sendKeys("34677");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(350));
    driver.findElement(By.xpath("//button[@id='checkout-shipping-continue']")).click();
	
	driver.findElement(By.xpath("//button[@class='button button--tertiary optimizedCheckout-buttonSecondary']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(350));
    driver.findElement(By.xpath("//a[@id='logout']")).click();
	
	driver.close();
	
	
	
}
}