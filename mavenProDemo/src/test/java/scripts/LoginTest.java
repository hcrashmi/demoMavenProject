package scripts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest 
{
	@Test
	public void login()
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
}
