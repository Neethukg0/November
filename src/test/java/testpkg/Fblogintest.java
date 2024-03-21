package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FBloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	}
	@Test
	public void testlogin()
	{
	FBloginpage ob = new FBloginpage(driver);
	ob.setvalues("abc@gmail.com", "abc");
	ob.login();
	}

}
