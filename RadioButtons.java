package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/radio.xhtml");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Most fav browser
			driver.findElement(By.xpath("(//label[contains(text(),'Edge')])[1]")).click();
			
			//Select and Deselect 
			driver.findElement(By.xpath("//label[contains(text(),'Bengaluru')]")).click();
			driver.findElement(By.xpath("//label[contains(text(),'Bengaluru')]")).click();
			
			//Default select radio button
			
			WebElement selection = driver.findElement(By.xpath("(//label[contains(text(),'Safari')])[2]"));
			
			 if (selection.isEnabled()) {
		            System.out.println("Radiobutton is selected");
		        } else {
		            System.out.println("Radiobutton is not selected");
		        }
			 
			 //Select age group 21 to 40 only if not selected
		
			 WebElement check1 = driver.findElement(By.xpath("//label[contains(text(),'21-40 Years')]"));
			 
			 if (check1.isEnabled()) {
		            System.out.println("Age is selected");
		        } else 
		        
		        {
		            
		        	WebElement click1 = driver.findElement(By.xpath("//label[contains(text(),'21-40 Years')]"));
		        	click1.click();
		       
		        }
			 
			 driver.close();
	}
	

}
