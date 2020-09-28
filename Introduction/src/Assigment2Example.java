import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment2Example {

	public static void main(String[] args) throws InterruptedException {
		String s = "Diana";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("#name")).sendKeys(s);
		Thread.sleep(2000L);
		//driver.findElement(By.id("alertbtn")).click();
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		
	}

}
