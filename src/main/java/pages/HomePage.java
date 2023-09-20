package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtil;

public class HomePage {
	
	WebDriver driver;
	private ElementUtil elementUtil;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		elementUtil=new ElementUtil(driver);
	}
	
	@FindBy(xpath="//span[text() ='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	@FindBy(name="search")
	private WebElement searchBoxField;
	
	@FindBy(xpath="//button[contains(@class,'btn-default')]")
	private WebElement searchButton;
	
	
	public void clickOnMyAccount() {
		//myAccountDropMenu.click();
		elementUtil.clickOnElement(myAccountDropMenu, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public LoginPage selectLoginOption() {
		
		elementUtil.clickOnElement(loginOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//loginOption.click();
		return new LoginPage(driver);
	}
	
	public RegisterPage selecRegisterOption() {
		elementUtil.clickOnElement(registerOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//registerOption.click();
		return new RegisterPage(driver);
	}
	
	
	public void enterProductIntoSearchBox(String productText) {
		elementUtil.typeTextIntoElement(searchBoxField, productText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//searchBoxField.sendKeys(productText);
		
	}
	
	
	public SearchResultsPage clickOnSearchButton() {
		//searchButton.click();
		elementUtil.clickOnElement(searchButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SearchResultsPage(driver);
		
	}
	

}
