package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNewAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kirannava2018");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("navarathinam");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@123456");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select dob = new Select(day);
		dob.selectByVisibleText("4");
	
		WebElement day1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select dob1 = new Select(day1);
		dob1.selectByVisibleText("Dec");
		
		WebElement day2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select dob2 = new Select(day2);
		dob2.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		driver.close();
		
	}

}
