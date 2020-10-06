import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.asserts.SoftAssert;

public class Section14 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("nameofcookie");

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new
		// File("C:\\Users\\Diana\\Desktop\\Nuotraukos/screenshot.png"));
		SoftAssert a = new SoftAssert();
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescode = conn.getResponseCode();
			System.out.println(rescode);
			a.assertTrue(rescode < 400, "The broken link is: " + link.getText() + " with a code: " + rescode);
		}
a.assertAll();
	}

}