import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code
				
		//We will strictly implement methods of webdriver
		//Create driver object for Firefox browser
			
		//invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pulumbak\\Documents\\Selenium Course\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
