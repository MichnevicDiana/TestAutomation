package assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		String element = driver.findElement(By.id("//div[@id='checkbox-example']//label[2]")).getText();
		System.out.println(element);
		
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		int count = dropdown.findElements(By.tagName("option")).size();
		
// sorry, dont know how to complete task
		
		
		
	}

}
