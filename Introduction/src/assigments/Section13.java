package assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section13 {

	public static void main(String[] args) {
		int sum = 0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/30189/notts-vs-leic-quarter-final-1-t20-blast-2020");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++) {

			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInteger = Integer.parseInt(value);
			sum = valueInteger + sum;
		
		}
		
		
		
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue= Integer.parseInt(Extras);
		int TotalSum = sum+extrasValue;
		System.out.println(TotalSum);
		
		
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalValue= Integer.parseInt(ActualTotal);
		if (ActualTotalValue == TotalSum) 
		{
		System.out.println("Count matches");	
		} else {
			System.out.println("Count doesnt match");
		}
	}

}
