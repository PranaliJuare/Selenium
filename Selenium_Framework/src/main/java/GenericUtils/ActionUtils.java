package GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionUtils {
    Actions actions;
    
	public ActionUtils(WebDriver driver) {
		actions =new Actions(driver);
	}
	
	public void ClickOnElement(WebElement ele) {
		actions.click(ele).perform();
	}
	
	public void PassDataForElement(WebElement ele,CharSequence... data) {
		actions.sendKeys(ele, data).perform();
	}
	
	public void MouseHoverOnElement(WebElement ele) {
		actions.moveToElement(ele).perform();
	}
	
	public void DoubleClickOnElement(WebElement ele) {
		actions.doubleClick(ele).perform();
	}
	
	public void RightClickOnElement(WebElement ele) {
		actions.contextClick(ele).perform();
	}
	
	public void DragAndDropElement(WebElement src, WebElement dest) {
		actions.dragAndDrop(src, dest).perform();
	}
	
	public void DragAndDropElementByOffset(WebElement ele, int XOffset, int YOffset) {
		actions.dragAndDropBy(ele, XOffset, YOffset).perform();
	}
	
	public void ScrollBasedOnAxis(int XOffset, int YOffset) {
		actions.scrollByAmount(XOffset, YOffset).perform();
	}
	
	public void ScrollUntilElementIsVisible(WebElement ele) {
		actions.scrollToElement(ele).perform();
	}
	
	public void ScrollUntilElementVisible(WebElement ele, int XOffset, int YOffset) {
		ScrollOrigin origin = ScrollOrigin.fromElement(ele);
		actions.scrollFromOrigin(origin,XOffset, YOffset).perform();
	}
}
