package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//	driver.findElement(By.id("locationsearch")).click();
		driver.findElement(By.xpath("//a/img[@alt='Chennai']")).click();
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Movie Library')]")).click();
		WebElement dropdown1 = driver.findElement(By.xpath("//label[contains(text(),'Genre')]/following-sibling::select"));
		Select dd = new Select(dropdown1);
		dd.selectByVisibleText("ANIMATION");
		WebElement dropdown2 = driver.findElement(By.xpath("//label[contains(text(),'Language')]/following-sibling::select"));
		Select dd1 = new Select(dropdown2);
		dd1.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted'])[1]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed To Book')]")).click();
		Thread.sleep(5000);
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select dd2 = new Select(dropdown3);
		dd2.selectByValue("PVR Velachery Chennai");
		
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@name='timings']"));
		Select dd3 = new Select(dropdown4);
		dd3.selectByVisibleText("09:00 AM - 12:00 PM");
		
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9966555123");
		WebElement dropdown5 = driver.findElement(By.xpath("//select[@name='food']"));
		Select dd4 = new Select(dropdown5);
		dd4.selectByValue("No");
		
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//div/label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@class='btn already-member'])[4]")).click();
		
		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.close();
		
		
	}

}
