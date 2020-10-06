package assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement source = driver.findElement(By.id("autocomplete"));
		source.sendKeys("LIT");
		 JavascriptExecutor js=(JavascriptExecutor)driver;

         String script="return document.getElementById(\"autocomplete\").value;";
         String text=(String) js.executeScript(script);
         
         while(!text.equalsIgnoreCase("Lithuania")) {
        	 
        	 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        	 text=(String) js.executeScript(script);
        	 System.out.println(text);
         }
		
		
         driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		

	}

}

/*
 * String script = "return document.getElementById(\"fromPlaceName\").value;";
 * String text=(String) js.executeScript(script); System.out.println(text); int
 * i =0; //BENGALURU INTERNATION AIPORT
 * while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT")) { i++;
 * driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.
 * DOWN);
 * 
 * text=(String) js.executeScript(script); System.out.println(text); if(i>10) {
 * break; }
 * 
 * }
 * 
 * if(i>10) { System.out.println("Element not found"); } else {
 * System.out.println("Element  found"); }
 */

