package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLearn2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//Basic checkbox
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
	//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		WebElement box = driver.findElement(By.xpath("//span[contains(text(),'Checked')]"));
		System.out.println(box.getText());
		Thread.sleep(4000);
		System.out.println("First notification done");
		
	//Choose favorite language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		
	// Tristate checkbox
		
		for (int i=1;i<=3;i++) {

		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		WebElement box2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p"));
		System.out.println(box2.getText());
	
		}

		
//toggle switch
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		System.out.println("toggle success");
		
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
		System.out.println("multiple selection done");
		driver.close();
		System.out.println("Browser closed");
	}

}
