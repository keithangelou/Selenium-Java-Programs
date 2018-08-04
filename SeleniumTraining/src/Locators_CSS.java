import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class Locators_CSS 
{	
	public static void main(String[] args) 
	{
			//chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulumbak\\Documents\\Selenium Course\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/"); //URL in browser
			driver.findElement(By.cssSelector("#email")).sendKeys("email@gmail.com");
			driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
			driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
	}

}
