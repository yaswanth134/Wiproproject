package GenricUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;

public class BaseClass {
	public WebDriver driver ;
	public FileUtility fUtils = new FileUtility();
	
	//@BeforeMethod
	public void bm() throws IOException {
		
		String browser = fUtils.fetchDataFromPropertyFile("browser");
		String url = fUtils.fetchDataFromPropertyFile("url");
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
//	@AfterMethod()
//	public void am() {
//		//driver.quit();
//	}

}
