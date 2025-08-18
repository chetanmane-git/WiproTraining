package testDemo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SynchronizationDemo {
    WebDriver driver;

    @Test(priority = 1)
    public void signUp() throws InterruptedException {
        System.out.println("Launching the browser.");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 🔄 Implicit Wait: Applies globally to all findElement calls
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        System.out.println("Signing Up");

        // ⏳ Explicit Wait: For specific conditions

        // Wait until gender radio button is clickable
       
        driver.findElement(By.id("gender-male")).click();        

        // Implicit wait will apply to these findElement calls
        driver.findElement(By.id("FirstName")).sendKeys("userFirstName");
        driver.findElement(By.id("LastName")).sendKeys("userLastName");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Emal"))).sendKeys("testuser14@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("userCompany");

        WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }

        driver.findElement(By.id("Password")).sendKeys("testPassword123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("testPassword123");

        // Wait until register button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button"))).click();

        System.out.println("SignUp successful");

        // Cleanup
        Thread.sleep(3000); // Optional: for visual confirmation
        driver.quit();
    }
}