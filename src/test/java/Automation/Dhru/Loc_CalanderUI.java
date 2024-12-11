package Automation.Dhru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loc_CalanderUI {

	@Test
	public void test() throws InterruptedException {
		
		String monthnumber = "6";
		String date = "15";
		String year = "2027";
		
		
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        Thread.sleep(2000);
        driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElement(By.xpath("(//button[@class='react-calendar__tile react-calendar__year-view__months__month'])[6]")).click();
       
	}
	
	
}
