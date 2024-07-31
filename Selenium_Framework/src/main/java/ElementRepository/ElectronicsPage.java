package ElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage {
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraPhotoLink;
	
	@FindBy(partialLinkText = " Cell phones")
	private WebElement cellPhonmesLink;
	

}
