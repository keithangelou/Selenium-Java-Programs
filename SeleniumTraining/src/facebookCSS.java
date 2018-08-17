import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookCSS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulumbak\\Documents\\Selenium Course\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //URL in browser
		//CSS Syntax - TagName[attribute='value']
		//Other CSS Syntax - tagName#id / tagName.className
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myemailCSS");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("12345"); //you cannot use * in place of tag name. Just leave it blank
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}
