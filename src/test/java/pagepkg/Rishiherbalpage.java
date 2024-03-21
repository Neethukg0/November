package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Rishiherbalpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement Health;
	
	@FindBy(xpath="//*[@id=\"outOfStockFilter\"]")
	WebElement Checkbox;
	
	@FindBy(xpath="//*[@id=\"input-sort\"]")
	WebElement Dropdown;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")
	WebElement Product;
	
	@FindBy(xpath="//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")
	WebElement Wishlist;
	
	public Rishiherbalpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void click()
	{
		Health.click();
		Checkbox.click();
		Select drop=new Select(Dropdown);
		drop.selectByValue("alphabet-asc");
		Product.click();
		Wishlist.click();
		
	}
}
