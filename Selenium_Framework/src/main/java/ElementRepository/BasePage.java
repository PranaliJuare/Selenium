package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.BaseClass;

public class BasePage extends BaseClass {
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingcartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelshoesLink;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOAD")
    private WebElement digitaldownloadLink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardsLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchbox;
	
	@FindBy(xpath = "//input[@value=\"Search\"]")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//img[@alt=\"Tricentis Demo Web Shop\"]")
	private WebElement logo;
	
	@FindBy(partialLinkText = "Tricentis")
	private WebElement tricentis;
	
	@FindBy(id = "newsletter-email")
	private WebElement textbox;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutLink;
	
	/**
	 * Getters
	 */
	
	/**
	 * this is used to access registerLink
	 * @return WebElement
	 */

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelshoesLink() {
		return apparelshoesLink;
	}

	public WebElement getDigitaldownloadLink() {
		return digitaldownloadLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getTricentis() {
		return tricentis;
	}

	public WebElement getTextbox() {
		return textbox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
