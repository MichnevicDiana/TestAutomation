import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section_10 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000L);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		// explicitwait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{
		int j = 0;
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
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
					break;

			}
		}
	}

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe"
	 * ); WebDriver driver = new ChromeDriver();
	 * driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	 * driver.manage().window().maximize(); Thread.sleep(2000);
	 * driver.findElement(By.cssSelector("[id='start'] button")).click();
	 * 
	 * Wait<WebDriver> wait = new
	 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
	 * .pollingEvery(Duration.ofSeconds(3));
	 * 
	 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	 * 
	 * public WebElement apply(WebDriver driver) { if
	 * (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
	 * 
	 * return driver.findElement(By.cssSelector("[id='finish'] h4"));
	 * 
	 * } else return null; } });
	 * System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).
	 * getText()); }
	 */
}