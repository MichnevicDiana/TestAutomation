package assigments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment2 {

	public static void main(String[] args) throws InterruptedException {
		String s = "indigo"; 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000L);
		
		driver.findElement(By.id("Adults")).click();
		driver.findElement(By.xpath("//select[@id='Adults'] //option[@value='4']")).click();
		
		driver.findElement(By.id("Childrens")).click();
		driver.findElement(By.xpath("//select[@id='Childrens'] //option[@value='4']")).click();
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(s);
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());  
	}

}
