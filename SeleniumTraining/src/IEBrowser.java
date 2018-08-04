import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code
						
		//We will strictly implement methods of webdriver
		//Create driver object for IE browser
					
		//invoke .exe file first
		System.setProperty("webdriver.ie.driver", "C:\\Users\\pulumbak\\Documents\\Selenium Course\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
				
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());	

	}

}
