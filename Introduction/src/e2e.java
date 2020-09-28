import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);	
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult'] //option[@value='5']")).click();
		   	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		   	Thread.sleep(2000L);
		  	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  	
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
}
}