package PageObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Login_Page {

	@FindBy(name = "Email")
	private WebElement EmailEdt;

	@FindBy(name = "Password")
	private WebElement PasswordEdt;

	@FindBy(name = "Login")
	private WebElement LoginBtn;

	public User_Login_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void loginToApp(String username, String password) {

		EmailEdt.sendKeys(username);
		PasswordEdt.sendKeys(password);
		LoginBtn.click();

	}

}
