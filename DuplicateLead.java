package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	

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
		
		//Create Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("KiranT");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Thilak");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Navarathinam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Testuser");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testuser");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testuser");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		 WebElement clearing = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		 clearing.clear();
		 clearing.sendKeys("newtest123");
		 
		  WebElement clearing1 = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		  clearing1.clear();
			 clearing1.sendKeys("newtest12323234");
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				String title3 = driver.getTitle();
				System.out.println(title3);
	}
	

}
