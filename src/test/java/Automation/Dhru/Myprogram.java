package Automation.Dhru;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myprogram {

	
	@Test
	public void test() throws InterruptedException {
		String name = "Rahul";
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
		driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
		
		driver.findElement(By.xpath("//button [text()='Log Out']")).click();
		
		
		
	}
	
	
}
