import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// nesamone

		/////////////////////////
		/*
		 * driver.get("http://google.com"); System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getPageSource()); driver.get("http://yahoo.com");
		 * driver.navigate().back(); driver.close(); driver.quit();
		 */
		/////////////////////////
		/*
		 * driver.get("http://facebook.com/");
		 * driver.findElement(By.id("email")).sendKeys("This is my code");
		 * driver.findElement(By.name("pass")).sendKeys("123456");
		 * driver.findElement(By.linkText("Forgot Password?")).click();
		 */
		//////////////////////////
		/*
		 * driver.get("http://login.salesforce.com/");
		 * driver.findElement(By.id("username")).sendKeys("Hello");
		 * driver.findElement(By.name("pw")).sendKeys("123456");
		 * driver.findElement(By.xpath("//*[@id='Login']")).click();
		 * System.out.println(driver.findElement(By.cssSelector("div#error.loginError"))
		 * .getText());
		 */
		/////////////////////////
		/*
		 * driver.get("http://facebook.com/");
		 * driver.findElement(By.cssSelector("#email")).sendKeys("bfhjdf");
		 * driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("fddff");
		 * driver.findElement(By.xpath("//*[@id='u_0_c']/div[3]/a")).click();
		 */
		///////////////////////
		driver.get("http://rediff.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("12346");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
	}
}
