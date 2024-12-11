package Automation.Dhru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loc_Disable {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		Thread.sleep(2000);

		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

	}

}
