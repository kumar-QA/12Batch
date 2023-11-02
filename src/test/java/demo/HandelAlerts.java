package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandelAlerts {

	ChromeDriver driver;
	
	@BeforeMethod
	public void lanuch() {
	
	     driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   driver.manage().window().maximize();
	}
	
	  @Test()
	  public void HandleNormalAlert() {
  
   driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
      driver.switchTo().alert().accept();
   
	  }
	  
	  @Test(priority = 0)
	  public void HandleConfirmationAlert() throws InterruptedException {
		
		   Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(3000);
//		 driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept(); 
		  
	  }
	  
	  @Test()
	  public void HandlePromptAlert() throws InterruptedException {

		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		   Thread.sleep(2000);
		   driver.switchTo().alert().sendKeys("hello testng");
		   Thread.sleep(2000);
		   driver.switchTo().alert().dismiss();
	  }

	  @AfterMethod
	  public void closeBroser() {
		  driver.close();
	  }
	
	
}
