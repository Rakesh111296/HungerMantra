package PageObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy(xpath = "//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")
	private WebElement ProfileBtn;
	
	@FindBy(xpath = "//li[.='Logout']")
	private WebElement LogoutLnk;
	
	public Home_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Logout () {
		ProfileBtn.click();
		LogoutLnk.click();
	
	}

}
