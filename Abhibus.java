package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div/div[contains(text(),'Chennai')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div/div[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//span[contains(text(),'Sleeper')]")).click();
		WebElement seats1 = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
		System.out.println(seats1.getText());
		WebElement seats = driver.findElement(By.xpath("(//button[contains(text(),'Show Seats')]/following::div[@class='text-grey'])[1]"));
		System.out.println(seats.getText());
		driver.findElement(By.xpath("(//button[@class='btn bus-info-btn filled primary sm inactive button'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'U16')]")).click();
		driver.findElement(By.xpath("(//div/input[@class='primary  '])[2]")).click();
		driver.findElement(By.xpath("(//div/input[@class='primary  '])[4]")).click();
		WebElement seats2 = driver.findElement(By.xpath("//span[contains(text(),'Seat Selected :')]"));
		System.out.println(seats2.getText());
		WebElement seats3 = driver.findElement(By.xpath("//span[contains(text(),'Base Fare :')]"));
		System.out.println(seats3.getText());
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}
	

}
