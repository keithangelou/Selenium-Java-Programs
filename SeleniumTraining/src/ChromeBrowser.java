import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//selenium code
		
		//We will strictly implement methods of webdriver
		//Create driver object for Chrome browser
		
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulumbak\\Documents\\Selenium Course\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/"); //hit url on the browser
		System.out.println(driver.getTitle()); //validate if you page title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you landed on the correct URL
		//System.out.println(driver.getPageSource()); //prints page source
		
		driver.get("https://www.oracle.com"); //go to next url
		driver.navigate().back(); //back to previous page
		driver.navigate().forward();
		driver.close(); //closes current browser
		//driver.quit(); //closes all browsers opened by selenium script
		
	}

}


