package Automation.Dhru;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Alert_Demo {

	
	
	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[@name='submit']")).click() ;
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String msg1 = alert.getText();
//		
//		System.out.println("Your message is.."+msg1);
//		alert.accept();
		
//		
//		driver.get("https://output.jsbin.com/osebed/2");
//	  Select s1 = new Select (driver.findElement(By.id("fruits")));
//	  s1.selectByIndex(0);
//	  s1.selectByVisibleText("Banana");
//	  
//	  for (int i=0; i<4 ;i++)
//	  {
//		  s1.selectByIndex(i);
//	  }
		
		
//		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		
//		Select s1 = new Select (driver.findElement(By.name("country"))) ;
//		s1.selectByIndex(0);
//		s1.selectByVisibleText("AMERICAN SAMOA");
//		
//		for (int i=0; i<10 ; i++)
//		{
//			s1.selectByIndex(i);
//			
//		}
//		
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(2000);
    WebElement Home = driver.findElement(By.linkText("Home"));
    Actions actions = new Actions (driver) ;
    
    Action a1 = actions.moveToElement(Home).build();
	    a1.perform();
		
//		driver.get("https://demo.guru99.com/popup.php");
//		Thread.sleep(2000);
//		
//		String mainw = driver.getWindowHandle();
//		System.out.println("Mainw is .."+mainw);
//		
//		driver.findElement(By.linkText("Click Here")).click();
//		Thread.sleep(3000);
//		
//		Set<String> allw = driver.getWindowHandles();
//		Iterator<String> i1 = allw.iterator();
//		
//		while (i1.hasNext())
//		{
//			
//			String childw = i1.next();
//			System.out.println("Allw is.."+childw);
//			if (!mainw.equals(childw))
//			{
//				driver.switchTo().window(childw);
//				Thread.sleep(3000);
//				driver.findElement(By.name("emailid")).sendKeys("dhrumilparikh3@gmail.com");
//				Thread.sleep(3000);
//				driver.findElement(By.name("btnLogin")).click();
//				Thread.sleep(3000);
//				driver.close();				
//			}
//			
//			  driver.switchTo().window(mainw);
//			  Thread.sleep(3000);
//			  System.out.println("Main title is "+driver.getTitle());
//			  Thread.sleep(3000);
//				driver.close();	
//			
//			
//			
//		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
