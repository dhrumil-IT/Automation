package Automation.Dhru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Loc_Dropdown {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);

		WebElement menmenu = driver.findElement(By.cssSelector(".desktop-navLink"));

		Actions actions = new Actions(driver);
		Actions a1 = actions.moveToElement(menmenu);
		a1.build();
		a1.perform();

		Thread.sleep(2000);

		WebElement Tshirt = driver.findElement(By.linkText("T-Shirts"));
		Tshirt.click();

		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]")).click();
		System.out.println("T-shirts categories show..");
		Thread.sleep(2000);

		WebElement Selecttshirt = driver.findElement(By.xpath("//li[@id='24950936']"));
		Selecttshirt.click();

		WebElement Selectsize = driver.findElement(
				By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[4]"));
		Selectsize.click();

		driver.close();

	}

}
