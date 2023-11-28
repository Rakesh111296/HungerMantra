

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This class consists of all generic methods to webDriver actions
 * @author Raki
 *
 */
public class WebDriverUtilities {
		
	/**
	 * this method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow (WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimizeWindow (WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	
	/**
	 * This method will wait for 10 seconds for the webpage to get loaded
	 * @param driver
	 */
	public void waitforPagetoLoad (WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	/**
	 * This method will wait for 10 seconds for the Element  to be visible
	 * @param driver
	 */
	public void waitforElementToBeVisible (WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will wait for 10 seconds for the Element  to be Clickable
	 * @param driver
	 */
	public void WaitforElementToBeClickable (WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will handle drop down by index
	 * @param driver
	 */
	public void handleDropdown (WebElement element, int index) {
		Select S = new Select(element);
		S.selectByIndex(index);
	}
	
	/**
	 * This method will handle drop down by value
	 * @param driver
	 */
	public void handleDropdown (WebElement element, String Value) {
		Select S = new Select(element);
		S.selectByValue(Value);
	}
	
	/**
	 * This method will handle drop down by Visible Text
	 * @param driver
	 */
	public void handleDropdown (String Text, WebElement element) {
		Select S = new Select(element);
		S.selectByVisibleText(Text);
	}
	
	/**
	 * This method will perform action of moving mouse to element and click
	 * @param driver
	 */
	public void mouseOverAction (WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		action.click(element).perform();
	}
	
	/**
	 * This method will perform action of double click on the  element
	 * @param driver
	 */
	public void doubleClickAction (WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	/**
	 * This method will perform action of right click on the  element
	 * @param driver
	 */
	public void rightClickAction (WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	/**
	 * This method will perform drag and drop action from source to traget webelement
	 * @param driver
	 */
	public void dragAndDropAction (WebDriver driver, WebElement srcElem, WebElement dstElem) {
		Actions action = new Actions(driver);
		action.dragAndDrop(srcElem, dstElem);
		}
	
	/**
	 * This method will perform ScrollDown action 500 units
	 * @param driver
	 */
	public void scrollDownAction (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);","");
		}	
	
	/**
	 * This method will perform ScrollUp action 500 units
	 * @param driver
	 */
	public void scrollUpAction (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500);","");
		}
	
	/**
	 * This method will perform Scroll Right action 500 units
	 * @param driver
	 */
	public void scrollRightAction (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500,0);","");
		}
	
	/**
	 * This method will perform Scroll Left action 500 units
	 * @param driver
	 */
	public void scrollLefttAction (WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(-500,0);","");
		}
	/**
	 * This method will accept the popup 
	 * @param driver
	 */
	public void acceptAlert (WebDriver driver) {
		driver.switchTo().alert().accept();		
	}
	
	/**
	 * This method will cancle the popup 
	 * @param driver
	 */
	public void cancleAlert (WebDriver driver) {
		driver.switchTo().alert().dismiss();		
	}
	
	/**
	 * This method will get the text from the popup 
	 * @param driver
	 */
	public String getTextFromPopUp (WebDriver driver) {
		String AlertText = driver.switchTo().alert().getText();	
		return AlertText;
	}
	
	/**
	 * This method will send keys to the popup and accept it
	 * @param driver
	 */
	public void PopUp (WebDriver driver, String key) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(key);
		a.accept();
		
		}
	
	
	public String captureScreenShot (WebDriver driver, String screenshotName) throws IOException {
		TakesScreenshot sc = (TakesScreenshot)driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\Screenshot\\"+screenshotName+".png");
		
		Files.copy(src, dst);//Creat
		
		return dst.getAbsolutePath(); //complete path of screenshot - extent repoerts
		
	}
	
	/**
	 * this method will switch btwn windows
	 * @param driver
	 * @param WINDOWID
	 */
	public void SwitchToWindow (WebDriver driver, String WINDOWID) {
		driver.switchTo().window(WINDOWID);
	}
}
