import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import PageObjectRepositiry.User_Login_Page;

public class Bass_class {

	public WebDriver driver;

	@BeforeSuite
	public void connectToDB() {
		System.out.println("---Connectiing to Database---");

	}

	@BeforeClass
	public void LaunchBrowser() throws Throwable {
		FileUtilities fUtil = new FileUtilities();
		String BROWSER = fUtil.readDataFromPropertyFile("browser");

		if (BROWSER.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();
		} else {
			System.out.println("-- invalide Browser Name --");
		}

		String URL = fUtil.readDataFromPropertyFile("url");

		driver.get(URL);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void LogintoApp() throws Throwable {
		FileUtilities fUtil = new FileUtilities();
		String USERNAME = fUtil.readDataFromPropertyFile("username");
		String PASSWORD = fUtil.readDataFromPropertyFile("password");

		User_Login_Page ulp = new User_Login_Page(driver);
		ulp.loginToApp(USERNAME, PASSWORD);
	}

}
