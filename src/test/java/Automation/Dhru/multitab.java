package Automation.Dhru;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multitab {

	@Test
	public void multitabb() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		String mainw = driver.getWindowHandle();
		System.out.println("Main window is.."+mainw);
		
		driver.findElement(By.linkText("Click Here")).click() ;
		Thread.sleep(2000);
		
		Set<String> allw = driver.getWindowHandles(); //Currently open browser windows and stores them in a Set
//		Iterator<String> i1 = allw.iterator(); //Creates an iterator (i1) to iterate over the window handles in the Set.
//		while(i1.hasNext()) //Loops through all the window handles until there are no more handles left in the iterator
//		{
//			
//			String Childw =i1.next(); //Retrieves the next window handle from the iterator and assigns it to the variable Childw
//			System.out.println("Allwindow is.."+Childw);
//			if (!mainw.equals(Childw)) //Checks if the current window (Childw) is not the main/original window (mainw).
//			{
//				driver.switchTo().window(Childw) ;
//				Thread.sleep(2000);
//				driver.findElement(By.name("emailid")).sendKeys("dhrumil@yopmail.com") ;
//				Thread.sleep(2000);
//				driver.findElement(By.name("btnLogin")).click() ;
//				Thread.sleep(2000);
//				driver.close();
//			}
//		}
		
		for(int i=0;i<=allw.size();i++) {
			String Childw =allw.iterator().next(); //Retrieves the next window handle from the iterator and assigns it to the variable Childw
			System.out.println("Allwindow is.."+Childw);
			if (!mainw.equals(Childw)) //Checks if the current window (Childw) is not the main/original window (mainw).
			{
				driver.switchTo().window(Childw) ;
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("dhrumil@yopmail.com") ;
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click() ;
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(mainw);
		Thread.sleep(2000);
		System.out.println("Main title is.."+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
	
	
	
}
