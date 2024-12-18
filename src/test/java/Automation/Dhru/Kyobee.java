package Automation.Dhru;

import static org.testng.Assert.assertEquals;

import java.awt.Button;
import java.time.Duration;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Kyobee {
	WebDriver driver = null ; 
	@BeforeTest
	public void beforetest() throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://development.kyobee.com/default/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn-link.btn-link-primary.fw-600.scrollToTop")).click();
		driver.get("https://development.kyobee.com/auth-b2b/signup-b2b");
	}
		@Test
		public void test() throws InterruptedException {
			
		Select s1 = new Select (driver.findElement(By.id("countryCode"))) ;
		s1.selectByValue("in");
		Thread.sleep(2000);
		driver.findElement(By.id("zip")).sendKeys("380009");
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("arrow");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary shadow font-16 w-auto px-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul [@class='col-12 col-sm-11 col-md-10 px-0 mx-auto search-list scrollToTop']//a[text()='Arrow - Ellis Bridge, Ahmedabad, Chimanlal Girdharlal Road, beside Sasuji Dining Hall, Ellisbridge, Ahmedabad, Gujarat, India']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='SAVE']")).sendKeys(Keys.CONTROL, Keys.END);
		driver.findElement(By.xpath("//button[text()='SAVE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("rituuu");
		driver.findElement(By.id("lastName")).sendKeys("rituuuu");
		driver.findElement(By.id("userName")).sendKeys("OrdexxTechnoo");
		driver.findElement(By.id("email")).sendKeys("ritu3334@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Ordex3@123");
		driver.findElement(By.id("confPassword")).sendKeys("Ordex3@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-primary.shadow.px-4.scrollToTop")).click();
		Thread.sleep(2000);
		


		
		}
	
}
