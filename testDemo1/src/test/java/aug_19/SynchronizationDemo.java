package aug_19;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

public class SynchronizationDemo {
    WebDriver driver;

    @Test(priority = 1)
    public void signUp() {
        try {
            System.out.println("Launching browser...");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Implicit Wait: Applies globally to all findElement calls
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
            System.out.println("Navigated to registration page.");

            // Explicit Wait: For specific conditions
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male"))).click();
            driver.findElement(By.id("FirstName")).sendKeys("userFirstName");
            driver.findElement(By.id("LastName")).sendKeys("userLastName");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("Email"))).sendKeys("testuser17@gmail.com");
            driver.findElement(By.id("Company")).sendKeys("userCompany");
            
            WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
            if (!newsletterCheckbox.isSelected()) {
                newsletterCheckbox.click();
            }

            driver.findElement(By.id("Password")).sendKeys("testPassword123");
            driver.findElement(By.id("ConfirmPassword")).sendKeys("testPassword123");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button"))).click();

            System.out.println("SignUp successful.");

        } catch (NoSuchElementException e) {
            System.err.println("Element not found: " + e.getMessage());
        } catch (TimeoutException e) {
            System.err.println("Timeout waiting for element: " + e.getMessage());
        } catch (ElementClickInterceptedException e) {
            System.err.println("Element not clickable: " + e.getMessage());
        } catch (WebDriverException e) {
            System.err.println("WebDriver error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        } finally {
            try {
                Thread.sleep(3000); // Optional visual confirmation
            } catch (InterruptedException ie) {
                System.err.println("Sleep interrupted: " + ie.getMessage());
            }
            if (driver != null) {
                driver.quit();
                System.out.println("Browser closed.");
            }
        }
    }
}