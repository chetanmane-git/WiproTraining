package testDemo1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

public class NopCommerceSmokeRegressionTesting {
	WebDriver driver;

	@Parameters({"browserName", "url"})	
	@BeforeClass(groups= {"smoke", "regression"})
	public void LaunchBrowser(String browserName, String url) {
		System.out.println("Launching the browser");
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Browser");
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test(groups = { "smoke" }) // (priority = 1)
	public void signUpToNopCommerce() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println("Navigating to registration page");
		driver.get("https://demo.nopcommerce.com/register");
		System.out.println("Performing SignUp");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-button")));
		WebElement genderMale = wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male")));
		genderMale.click();
		driver.findElement(By.id("FirstName")).sendKeys("userFirstName");
		driver.findElement(By.id("LastName")).sendKeys("userLastName");
		driver.findElement(By.id("Email")).sendKeys("user791@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("userCompany");
		WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
		if (!newsletterCheckbox.isSelected()) {
			newsletterCheckbox.click();
		}
		driver.findElement(By.id("Password")).sendKeys("user123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("user123");
		WebElement registerButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button")));
		registerButton.click();
		System.out.println("SignUp successful");
	}

	@Test(groups = { "regression" }) // (priority = 2)
	public void LoginToNopCommerce() throws InterruptedException {
		System.out.println("Navigating to login page");
		driver.get("https://demo.nopcommerce.com/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println("Performing login");

		wait.until(ExpectedConditions.elementToBeClickable(By.name("Email"))).sendKeys("user791@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("user123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		System.out.println("Login successful");
	}

	@Ignore("searchBox Test Case Ignored")
	@Test(groups = { "regression" })
	public void searchToNopCommerce() {
		System.out.println("Navigating to search box page.");
		driver.get("https://demo.nopcommerce.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println("Searching");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("q"))).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
		System.out.println("Searching Done");
	}

	@BeforeClass(groups= {"smoke", "regression"}) // Reset to login page
	public void afterClass() throws InterruptedException {
		System.out.println("Closing the browser after done");
		if (driver != null) {
			driver.quit();
		}
	}
}
