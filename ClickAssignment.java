package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAssignment {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://leafground.com/button.xhtml");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	//Click and confirm title
			driver.findElement(By.xpath("//span[contains( text(),'Click')]")).click();
			String pageTitle = driver.getTitle();
			String expectedTitle= "Dashboard";
			System.out.println(pageTitle);
			
	// Verify title of the page		
			if (pageTitle.equals(expectedTitle)) {
	            System.out.println("Page title is as expected: " + expectedTitle);
	        } else {
	            System.out.println("Page title is not as expected. Actual title: " + pageTitle);
	            
	        }
			
	//navigate
			
			driver.navigate().back();
			
	//Confirm if button is disabled
			
		WebElement button = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		
		 if (!button.isEnabled()) {
	            System.out.println("The button is disabled");
	        } else {
	            System.out.println("The button is enabled");
	        }
	//find position
		 
		 WebElement position = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[1]"));
		 Point buttonloc = position.getLocation();
		 System.out.println(buttonloc.getX());
		 System.out.println(buttonloc.getY());
	//find color
		 
		 WebElement buttoncolor = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
		 String mainbuttoncolor = buttoncolor.getCssValue("color");
		 System.out.println(mainbuttoncolor);
		
		 
	// height and width of the button
		 
		 WebElement button1 = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]"));
		 			Dimension size = button1.getSize();
		 			int height = size.getHeight();
		 			int width = size.getWidth();
		 			System.out.println(height);
		 			System.out.println(width);
		 			
		//close the window
		 			driver.close();
		 	
}
}