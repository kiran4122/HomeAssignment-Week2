package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement username =driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crmsfa.getText());
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("123123");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Computer Software");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}
