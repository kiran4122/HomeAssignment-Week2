package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9087987876");
	driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	Thread.sleep(2000);
	 WebElement store = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]"));
	String value = store.getText();
	System.out.println(value);
	store.click();
	driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(value);
	driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	WebElement store1 = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
	String text = store1.getText();
	System.out.println(text);
	
	if(text.equals("No records to display")) {
		
		System.out.println("Deleted successfully");
	}
		
		else {
			System.out.println("Not Deleted successfully");
		}
	}
	
	}


