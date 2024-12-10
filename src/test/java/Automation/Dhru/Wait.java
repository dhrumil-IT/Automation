package Automation.Dhru;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait {

	@Test
	public void test() throws InterruptedException {

		
		        

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        try {
		            // Navigate to the webpage
		            driver.get("https://example.com");

		            // Create WebDriverWait with a 10-second timeout
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		            // Wait for the login button to be clickable
		           
		            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		            WebElement login1Button = wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert']")));
		            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner")));
		            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("status"), "Success"));
		            wait.until(ExpectedConditions.titleContains("Dashboard"));
		            wait.until(ExpectedConditions.urlContains("dashboard"));

		            loginButton.click();

		            // Wait for the success message to appear
		            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success")));
		            System.out.println("Message: " + successMessage.getText());
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }
		
}
