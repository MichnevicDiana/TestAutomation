package assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Nested')]")).click();
		//System.out.println(driver.findElement(By.tagName(tagName)));
		//driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']")).getText());
		
	}

}
