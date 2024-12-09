package Automation.Dhru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Unique_Dropdown {

	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		
		for (int i=0; i<5;i++) 
		{
		
		
			driver.findElement(By.id("hrefIncAdt")).click();
		
		
	     }
	
		driver.findElement(By.id("btnclosepaxoption")).click();
}
}
	
