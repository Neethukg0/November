package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Rishiherballogin;
import pagepkg.Rishiherbalpage;

public class Rishiherballogintest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://rishiherbalindia.linker.store/");
	//driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		Rishiherballogin ob = new Rishiherballogin(driver);
		ob.click();
	
	}

}
