package Automation.Dhru;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loc_heightandwidth {

	@Test
	public void test() throws InterruptedException {
			
		
	WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
    Thread.sleep(2000);
    
    WebElement element = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
    
    
    org.openqa.selenium.Dimension size = element.getSize();
    
    int height = size.getHeight();
    int width = size.getWidth();
    
    
    
    System.out.println("Element height is .."+height);
    System.out.println("Element width is.."+width);
    
    driver.close();
    
}
}


