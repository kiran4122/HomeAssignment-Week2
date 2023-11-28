package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathLearning {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		WebElement box = driver.findElement(By.xpath("//span[contains(text(),'Checked')]"));
		System.out.println(box.getText());
		Thread.sleep(4000);

		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		
	

		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	//	WebElement box2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']]"));
	//	System.out.println(box2.getText());
		
		//driver.findElement(By.xpath(
		//		"//div[@id='j_idt87:ajaxTriState']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active']"))
		//		.click();
		//WebElement box3 = driver
		//		.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p[text()='State = 2']"));
		//System.out.println(box3.getText());

		//driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active']"))
		//		.click();
		//WebElement box4 = driver
		//		.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p[text()='State = 0']"));
		//System.out.println(box4.getText());

		
//toggle switch
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
//check box disabled
		
		WebElement enabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		if (enabled.isSelected()) {
            System.out.println("Checkbox is enabled");
        } else {
            System.out.println("Checkbox is disabled");
        }
		
// multiple option selection
		
		
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("//li//label[contains(text(),'Paris')]")).click();
		driver.findElement(By.xpath("//li//label[contains(text(),'London')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		System.out.println("completed");
		driver.close();

	}

	}

