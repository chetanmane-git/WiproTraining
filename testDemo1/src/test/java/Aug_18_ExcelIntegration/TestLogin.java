package Aug_18_ExcelIntegration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;

    @Test(dataProvider = "getData", dataProviderClass = ExcelDataProvider.class)
    public void login(String userName, String password) throws InterruptedException {
        System.out.println("Launching the browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login");

        System.out.println("Logging with: " + userName + " | " + password);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.name("Email"))).sendKeys(userName);
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        System.out.println("Login attempt submitted");
        System.out.println("------------------------------------------");
        Thread.sleep(2000);

		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='nopCommerce demo store']")));
			System.out.println("Login successful for user: " + userName);
		} catch (Exception e) { // Optional: capture error message // String errorMsg =
			driver.findElement(By.xpath("div[@class='message-error validation-summary-errors']")).getText();

			System.out.println("Login failed for user: " + userName + " | Message: ");
			Assert.fail("Login failed for user: " + userName);
		}
		 

        driver.quit();
    }
}