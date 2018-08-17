import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulumbak\\Documents\\Selenium Course\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //URL in browser
		//Xpath Syntax - //tagName[@attribute='value']
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("youremail");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
