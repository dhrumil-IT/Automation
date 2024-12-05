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

public class Class_1 {

	
	@Test
	public void test() throws InterruptedException
	{
		 //setup 
		 WebDriver driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
         Thread.sleep(2000);
         driver.manage().window().maximize();
         
         //search the product
         driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys("Ca");
         Thread.sleep(2000);
         
         //List of Products
         
         List<WebElement> products = driver.findElements(By.cssSelector(".products .product"));
         Thread.sleep(2000);
         
         //select the product
         for (WebElement product : products )
         {
        	 String productname = product.findElement(By.cssSelector("h4.product-name")).getText();
        	 if ( productname.contains("Carrot") || productname.contains("Capsicum")  ) {
             product.findElement(By.cssSelector(".product-action button")).click();
         }
         }
         
       
          //added in cart
         driver.findElement(By.xpath("//img[@alt='Cart']")).click();
         driver.findElement(By.xpath("//button [text()='PROCEED TO CHECKOUT']")).click();
         Thread.sleep(2000);
         
         //promocode apply
         driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
         Thread.sleep(2000);
       
         
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          WebElement Successmessage = wait.until(ExpectedConditions.visibilityOfElementLocated( By.cssSelector(".promoInfo")));
          
          String messagetext = Successmessage.getText();
          System.out.println("Promo code Message "+messagetext);
          
          if(messagetext.equals("Code applied ..!")) {
        	  System.out.println("Promo code is applied succesfully..");
          }else
        	  System.out.println("Promo code is applied failed");
        	  
          }
           
     
        
	}

       
        	 
        	 
        	 
        	 
         
         
		 
		
		
		
		
		
		
		
	
	
	

