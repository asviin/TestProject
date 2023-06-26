package commonUtils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;



public class BaseClass {
	
	public static WebDriver driver;
	FileUtility f = new FileUtility();
	
	
	@BeforeTest
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		
		LoginPage l = new LoginPage(driver);
		String url = f.getPropertyData("url");
		driver.get(url);
		Thread.sleep(7000);
		System.out.println(f.getPropertyData("username"));
		l.login(f.getPropertyData("username"), f.getPropertyData("password"));
		
		
	}
	

	
	

}
