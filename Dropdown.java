package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
	Thread.sleep(2000);
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KiranT");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thilak");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Navarathinam");
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	Select dd = new Select(source);
	dd.selectByIndex(4);
	
	WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select mark = new Select(market);
	mark.selectByValue("DEMO_MKTG_CAMP");

	
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select ind = new Select(industry);
	ind.selectByValue("IND_SOFTWARE");
	
	WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));

		Select owner = new Select(ownership);
		owner.selectByVisibleText("S-Corporation");

	}

}
