package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrgangeHRM {
	WebDriver driver;


				
	@Test
	public void LaunchApp() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.id("mainnav_login")).click();	
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	@Test
	public void Login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123"+Keys.ENTER);
		
	}
	
	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		
	}
	
	@Test
	public void VerifyMyInfo() {
		System.out.println(driver.findElement(By.xpath("//span[normalize-space()='My Info']")).isDisplayed());
		driver.quit();
	}
	
	@Test
	public void VerifyLogin() {
		WebElement element =driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
	}
	
	
	
	
	}
		