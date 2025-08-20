package Aug_16;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    WebDriver driver;

    @Test(dataProvider = "logInSignUpTestData", priority = 1)
    public void signUp(String userName, String password) throws InterruptedException {
        System.out.println("Launching the browser.");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        System.out.println("Signing Up");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male"))).click();

        driver.findElement(By.id("FirstName")).sendKeys("userFirstName");
        driver.findElement(By.id("LastName")).sendKeys("userLastName");
        driver.findElement(By.id("Email")).sendKeys(userName);
        driver.findElement(By.id("Company")).sendKeys("userCompany");

        WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }

        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button"))).click();

        System.out.println("SignUp successful");
        Thread.sleep(3000); // Optional visual confirmation
        driver.quit();
    }

    @Test(dataProvider = "logInSignUpTestData", priority = 2)
    public void logIn(String userName, String password) throws InterruptedException {
        System.out.println("Launching the browser.");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        System.out.println("Logging In");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Email"))).sendKeys(userName);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        System.out.println("Login successful");
        Thread.sleep(3000); // Optional visual confirmation
        driver.quit();
    }

    @DataProvider(name = "logInSignUpTestData")
    public Object[][] logInData() {
        return new Object[][] {
            { "vaibhav@gmail.com", "vaibhav123" },
            { "chetan@gmail.com", "chetan123" }
        };
    }
}