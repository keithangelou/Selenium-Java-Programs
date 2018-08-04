import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class Locators_ClassName 
{	
	public static void main(String[] args) 
	{
			//chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulumbak\\Documents\\Selenium Course\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://login.salesforce.com/"); //URL in browser
			driver.findElement(By.id("username")).sendKeys("hello");
			driver.findElement(By.name("pw")).sendKeys("12345");
			driver.findElement(By.className("button r4 wide primary")).click(); //Error due to Compound class name
	}

}
