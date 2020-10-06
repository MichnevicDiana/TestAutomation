package assigments;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement a = driver.findElement(By.id("product"));
		int rows = a.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println("Number of rows: " + rows);
		int column = a.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println("Number of columns: " + column);

		for (int i = 0; i < column; i++) {
			System.out.println(a.findElements(By.xpath("//table[@id='product']/tbody/tr[3]/td")).get(i).getText());

		}

	}

}
