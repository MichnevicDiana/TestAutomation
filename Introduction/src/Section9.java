import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section9 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		
		String[] itemsNeeded = { "Cucumber", "Brocolli","Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000L);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format to get actual vegetable name(remove 1 kg)
			// convert array into array list for easy search
			// check if name you extracted is present in arrayList or not
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button   ")).get(i).click();
				if (j == itemsNeeded.length) 
					break;
				
			}
		}
	}

}
