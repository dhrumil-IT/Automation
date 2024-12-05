package Automation.Dhru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowactivation {

	
	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}
	
	
}
