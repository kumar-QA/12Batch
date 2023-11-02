package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BeforeMethodEx {
	ChromeDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void Validloginfunction() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}
	@Test
	public void InvalidLoginFunction() {
		driver.findElement(By.id("username")).sendKeys("stfvfudent");
		driver.findElement(By.name("password")).sendKeys("Passworvrgvrd123");
		driver.findElement(By.id("submit")).click();
	}
	 @Test
	 public void validUserInvalidPwd() {
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.name("password")).sendKeys("Passworvrgvrd123");
			driver.findElement(By.id("submit")).click();
	 }
	 
	 @AfterMethod
	 public void closebrowser() {
		 driver.close();
	 }
}
