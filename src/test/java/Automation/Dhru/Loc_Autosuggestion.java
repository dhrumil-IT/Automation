package Automation.Dhru;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loc_Autosuggestion {

	@Test
	public void test() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		List <WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	
		for (WebElement option :options )
		{
			
			if (option.getText().equalsIgnoreCase("India")) 
			{
			  option.click();
			  break;
				
			}
			
		}
		
		
		
	}
	
	
}
