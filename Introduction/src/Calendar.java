import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		// August 23
		//driver.findElement(By.id("ez-accept-all")).click();
		//driver.findElement(By.className("makeFlex.hrtlCenter.font10 makeRelative lhUser")).click();
		
		driver.findElement(By.className("lbl_input.latoBold.appendBottom10")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='fsw_inputBox dates.inactiveWidget/label')"));
		int count = driver.findElements(By.xpath("//div[@class='fsw_inputBox dates.inactiveWidget/label')")).size();
		for (int i = 0; i < count; i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				dates.get(i).click();
				break;
			}

		}
	}

}
