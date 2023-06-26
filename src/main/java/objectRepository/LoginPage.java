package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement usernametbx;
	
	@FindBy(name = "pwd")
	private WebElement pwdtbx;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgnbtn;
	
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUsernametbx() {
		return usernametbx;
	}

	public WebElement getPwdtbx() {
		return pwdtbx;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	public void login(String username, String password) {
		
		usernametbx.sendKeys(username);
		pwdtbx.sendKeys(password);
		lgnbtn.click();
	
		
		
	}

}
