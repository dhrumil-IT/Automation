package Automation.Dhru;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Pre_wikipedia {

	@Test
	public void test() throws InterruptedException {
		
		
			
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.wikipedia.org/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		driver.findElement(By.id("searchInput")).sendKeys("Apple Inc.");
		driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='plainlist'])[4]//ul//li/a")));	
	
		List<WebElement> fouderList = driver.findElements(By.xpath("(//div[@class='plainlist'])[4]//ul//li/a"));
		
		System.out.println("Print all founderslist..");
		
		for (WebElement PrintList : fouderList )
		{
			
			String printfounderlist = PrintList.getText();
			System.out.println(printfounderlist);
			
		}
		
		driver.close();
	}
}

	
	

