package testDemo1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NopCommerce {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.out.println("Launching the browser");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@Test(priority = 2)
	public void signUpToNopCommerce() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    System.out.println("Navigating to registration page");
	    driver.get("https://demo.nopcommerce.com/register");
	    System.out.println("Performing SignUp");
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-button")));
	    WebElement genderMale = wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male")));
	    genderMale.click();
	    driver.findElement(By.id("FirstName")).sendKeys("userFirstName");
	    driver.findElement(By.id("LastName")).sendKeys("userLastName");
	    driver.findElement(By.id("Email")).sendKeys("user222@gmail.com");
	    driver.findElement(By.id("Company")).sendKeys("userCompany");
	    WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
	    if (!newsletterCheckbox.isSelected()) {
	        newsletterCheckbox.click();
	    }
	    driver.findElement(By.id("Password")).sendKeys("user123");
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("user123");
	    WebElement registerButton = wait.until(	ExpectedConditions.elementToBeClickable(By.id("register-button")));
	    registerButton.click();
	    System.out.println("SignUp successful");
	}
	
	@Test(priority = 1)
	public void loginToNopCommerce() throws InterruptedException {
	    System.out.println("Navigating to login page");
	    driver.get("https://demo.nopcommerce.com/login");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    System.out.println("Performing login");

	    wait.until(ExpectedConditions.elementToBeClickable(By.name("Email")))
	        .sendKeys("user223@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("user123");
	    driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	    System.out.println("Login successful");
	}
	

	@AfterClass
	public void afterClass() {
		System.out.println("Closing the browser");
		if (driver != null) {
			driver.quit();
		}
	}

}
