package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {


		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		//Enter user id and password	
			
		WebElement username =driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Select CRMSFA link
		
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crmsfa.getText());
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	
		// Create Lead
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("KiranT");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Thilak");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Navarathinam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Testuser");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testuser");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testuser");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("test@gmail.com");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select newstate = new Select(state);
		newstate.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Edit Lead
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		WebElement clearing = driver.findElement(By.xpath("//textarea[@name='description']"));
		clearing.clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("test");
		
		//Update the lead details
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		//close
		driver.close();
			

	}

}
