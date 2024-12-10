package Automation.Dhru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loc_Calander {

	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']")).click();
		Thread.sleep(2000);
		
		
		
		
	}
	
	
}
