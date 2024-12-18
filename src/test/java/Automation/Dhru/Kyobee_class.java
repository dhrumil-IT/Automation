package Automation.Dhru;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Kyobee_class {

	public class Kyobee {
		WebDriver driver = null;

		@BeforeTest
		public void beforetest() throws InterruptedException {

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.get("https://development.kyobee.com/default/auth/login");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".btn-link.btn-link-primary.fw-600.scrollToTop")).click();
			driver.get("https://development.kyobee.com/auth-b2b/signup-b2b");
		}

		@Test
		public void test() throws InterruptedException {

			Select s1 = new Select(driver.findElement(By.id("countryCode")));
			s1.selectByValue("in");
			Thread.sleep(2000);
			driver.findElement(By.id("zip")).sendKeys("380009");
			Thread.sleep(2000);
			driver.findElement(By.id("search")).sendKeys("arrow");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary shadow font-16 w-auto px-4']"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//ul [@class='col-12 col-sm-11 col-md-10 px-0 mx-auto search-list scrollToTop']//a[text()='Arrow - Ellis Bridge, Ahmedabad, Chimanlal Girdharlal Road, beside Sasuji Dining Hall, Ellisbridge, Ahmedabad, Gujarat, India']"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='SAVE']")).sendKeys(Keys.CONTROL, Keys.END);
			driver.findElement(By.xpath("//button[text()='SAVE']")).click();
			Thread.sleep(2000);

			WebElement firstname = driver.findElement(By.id("firstName"));
			firstname.clear();
			firstname.sendKeys("Josh");
			Thread.sleep(2000);
			WebElement lastname = driver.findElement(By.id("lastName"));
			lastname.clear();
			lastname.sendKeys("Park");
			Thread.sleep(2000);
			WebElement username = driver.findElement(By.id("userName"));
			username.clear();
			username.sendKeys("park@3455");
			Thread.sleep(2000);
			WebElement email = driver.findElement(By.id("email"));
			email.clear();
			email.sendKeys("mike569@yopmail.com");
			Thread.sleep(2000);
			WebElement password = driver.findElement(By.id("password"));
			password.clear();
			password.sendKeys("Ordex@123");
			Thread.sleep(2000);
			WebElement confirmpassword = driver.findElement(By.id("confPassword"));
			confirmpassword.clear();
			confirmpassword.sendKeys("Ordex@123");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".btn.btn-primary.shadow.px-4.scrollToTop")).click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement popUp = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("verificationCodeModal")));

			driver.findElement(By.xpath("(//input[@name='actCodee[index]'])[1]")).sendKeys("1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='actCodee[index]'])[2]")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='actCodee[index]'])[3]")).sendKeys("3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='actCodee[index]'])[4]")).sendKeys("4");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='actCodee[index]'])[5]")).sendKeys("5");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='actCodee[index]'])[6]")).sendKeys("6");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("div[class='col-12 text-center modal-btn py-4'] button[type='submit']")).click();
			Thread.sleep(2000);

			driver.close();
			
			
		}
	}
}
