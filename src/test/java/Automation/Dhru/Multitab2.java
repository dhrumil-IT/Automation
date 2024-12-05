package Automation.Dhru;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multitab2 {

	@Test
	public  void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		String mainw = driver.getWindowHandle();
		System.out.println("Mainw is.."+mainw);
		
		Set<String> multiw = driver.getWindowHandles();
		Iterator<String> i1= multiw.iterator();
		
		while (i1.hasNext())
		{
			String childw =i1.next();
			System.out.println("Allw is.."+childw);
		    if (!mainw.equals(childw))
		    {
		    	driver.switchTo().window(childw);
		    	Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("dhrumil@yopmail.com") ;
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click() ;
				Thread.sleep(2000);
				driver.close();	    	
		    }
			
		    driver.switchTo().window(mainw);
		    System.out.println("mainw title is.."+driver.getTitle());
		    Thread.sleep(2000);
		    driver.close();	 
		}
		
	}
}



