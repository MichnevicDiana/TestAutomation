package assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Assigment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption1")).click();
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		// selecting option in dropdown
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(opt);
		// enter option
		driver.findElement(By.name("enter-name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		//alert msg
		System.out.println(driver.switchTo().alert().getText());
		String text = driver.switchTo().alert().getText();
		if (text.contains(opt)) {
			System.out.println("alert message succes");
		} else
			System.out.println("smth get wrong");

	}

}
