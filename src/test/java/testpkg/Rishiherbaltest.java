package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Rishiherbalpage;

public class Rishiherbaltest {
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
	Rishiherbalpage ob = new Rishiherbalpage(driver);
ob.click();
}
}
