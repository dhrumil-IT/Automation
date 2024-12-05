package Automation.Dhru;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SiblingandParenttravel {

	
	@Test
	public void test() throws InterruptedException {
		
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  Thread.sleep(2000);
	 // Sibling -child to parent travel
	  System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	  Thread.sleep(2000);
	  
	  System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText());
		
		
		
	}
	
}
