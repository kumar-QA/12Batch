package demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	ChromeDriver driver;
	@BeforeTest
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	

	@Test(priority = 3)
	public void Validloginfunction() {
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();

	}
  
	@Test(priority = 2)
	public void InvalidLoginFunction() {
		
		driver.findElement(By.id("username")).sendKeys("stfvfudent");
		driver.findElement(By.name("password")).sendKeys("Passworvrgvrd123");
		driver.findElement(By.id("submit")).click();

	}

	 @Test(priority = 1)
	 public void validUserInvalidPwd() {
	
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.name("password")).sendKeys("Passworvrgvrd123");
			driver.findElement(By.id("submit")).click();
	 }
	 
	 @AfterTest
	 public void closeBrowser() {
		 driver.close();
	 }
	
}
