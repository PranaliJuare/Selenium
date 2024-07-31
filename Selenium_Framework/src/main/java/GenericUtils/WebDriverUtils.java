package GenericUtils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {
	WebDriver driver;

	public WebDriverUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void SwitchToAWindowBasedOnTitle(String title) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for (String windowId : allwindowIds) {
			driver.switchTo().window(windowId);
			if (driver.getTitle().equals(title)) {
				break;
			}
		}
	}

	public void SwitchToAWindowBasedOnUrl(String url) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for (String windowId : allwindowIds) {
			driver.switchTo().window(windowId);
			if (driver.getCurrentUrl().equals(url)) {
				break;
			}
		}
	}

	public void SwitchToAlertAndClickOnOk() {
		driver.switchTo().alert().accept();
	}

	public void SwitchToAlertAndClickOnCancel() {
		driver.switchTo().alert().dismiss();
	}

	public String GetAlertText() {
		return driver.switchTo().alert().getText();
	}

	public void PassValueForAlertTextBox(String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	public void SwitchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void SwitchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public void SwitchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public void SwitchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public void SwitchToDefaultContent() {
		driver.switchTo().defaultContent();		
	}
}
