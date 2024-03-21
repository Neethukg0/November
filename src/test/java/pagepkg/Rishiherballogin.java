package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Rishiherballogin {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/span")
	WebElement myaccount;
	
	
	
	@FindBy(xpath="/html/body/div[1]/header/div/div/div/div[1]/div[2]/div/ul/li[1]/ul/li[2]/a")
	WebElement Login;
	
	public Rishiherballogin(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void click()
	{
		myaccount.click();
		Login.click();
	}

}
