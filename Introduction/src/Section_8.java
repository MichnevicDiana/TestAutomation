import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diana.michnevic\\Desktop\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		/*///////////////////////////
		 * 
		 * driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		 * Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * s.selectByValue("USD"); s.selectByIndex(1); s.selectByVisibleText("AED");
		 * 
		 *///////////////////////////
		
		/*
		 * driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.id("divpaxinfo")).click();
		 * 
		 * Thread.sleep(2000L);
		 */
			
					/*
					 * int i=1;
					 * 
					 * while(i<5) { driver.findElement(By.id("hrefIncAdt")).click();
					 * 
					 * }
					 */
			
		/*
		 * for(int i=1;i<5;i++) { driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * }
		 * 
		 * Thread.sleep(2000L);
		 * 
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("its enabled");
			org.testng.Assert.assertTrue(true);
		}
		else 
			org.testng.Assert.assertTrue(false);
		
		
		
		
		
	}

}
