package users;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonUtils.BaseClass;

@Listeners(commonUtils.ListenerImp.class)

public class Users extends BaseClass {
	
	@Test(retryAnalyzer = commonUtils.RetryAnalyzer.class )
	public void createUserTest() {
		driver.get("goo");
	}

}
