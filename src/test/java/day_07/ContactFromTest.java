package day_07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class ContactFromTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to the ChromeDriver executable
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.numpyninja.com/contact");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Test case 1: Positive scenario - Fill all fields with valid data and submit
    @Test
    public void testSubmitWithValidData() {
    	
    	WebElement firtnameele=driver.findElement(By.name("first-name"));
    	firtnameele.sendKeys("John Doe");
        driver.findElement(By.name("last-name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("phone")).sendKeys("1234567890");
        driver.findElement(By.id("textarea_comp-l1c0ku07")).sendKeys("This is a test message.");
        
        driver.findElement(By.id("comp-l1c0ku0e3")).click();

        // Verify successful submission (This part depends on the actual success message/URL)
        //String expectedSuccessMessage = "Thank you for your message";
        //WebElement confirmationMessage = driver.findElement(By.id("confirmationMessage")); // replace with the actual element
        //assertEquals(expectedSuccessMessage, confirmationMessage.getText());
    }

    // Test case 2: Negative scenario - Leave Name field blank and try submitting
    @Test
    public void testSubmitWithBlankName() {
        driver.findElement(By.name("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("phone")).sendKeys("1234567890");
        driver.findElement(By.id("textarea_comp-l1c0ku07")).sendKeys("This is a test message.");

        driver.findElement(By.id("comp-l1c0ku0e3")).click();

        // Verify that an error message appears (adjust to actual error message/validation element)
        //WebElement nameError = driver.findElement(By.id("nameError")); // Replace with actual element id
        //assertTrue(nameError.isDisplayed());
    }

    // Test case 3: Negative scenario - Enter an invalid email format and try submitting
    @Test
    public void testSubmitWithInvalidEmail() {
        driver.findElement(By.name("first-name")).sendKeys("John Doe");
        driver.findElement(By.name("last-name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("invalidemail");
        driver.findElement(By.name("phone")).sendKeys("1234567890");
        driver.findElement(By.id("textarea_comp-l1c0ku07")).sendKeys("This is a test message.");

        driver.findElement(By.id("comp-l1c0ku0e3")).click();

        // Verify that the email error message is displayed
       // WebElement emailError = driver.findElement(By.id("emailError")); // Replace with actual element id
        //assertTrue(emailError.isDisplayed());
    }

    // Test case 4: Negative scenario - Leave the Message field blank and try submitting
    @Test
    public void testSubmitWithBlankMessage() {
        driver.findElement(By.name("first-name")).sendKeys("John Doe");
        driver.findElement(By.name("last-name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("phone")).sendKeys("1234567890");

        driver.findElement(By.id("comp-l1c0ku0e3")).click();

        // Verify that the message error message is displayed
       // WebElement messageError = driver.findElement(By.id("messageError")); // Replace with actual element id
       // assertTrue(messageError.isDisplayed());
    }

    // Test case 5: Negative scenario - Enter a phone number with non-numeric characters
    @Test
    public void testSubmitWithInvalidPhoneNumber() {
        driver.findElement(By.name("first-name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("phone")).sendKeys("abcd1234");
        driver.findElement(By.id("textarea_comp-l1c0ku07")).sendKeys("This is a test message.");

        driver.findElement(By.id("comp-l1c0ku0e3")).click();

        // Verify that the phone error message is displayed
        //WebElement phoneError = driver.findElement(By.id("phoneError")); // Replace with actual element id
        //assertTrue(phoneError.isDisplayed());
    }
}

