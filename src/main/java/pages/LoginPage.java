package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtil;

public class LoginPage {
	 WebDriver driver;
	 private ElementUtil elementutil;
	 
	 public LoginPage (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 elementutil=new ElementUtil(driver);
	 }
	 
	 @FindBy(id="input-email")
	 private WebElement emailField;
	 
	 @FindBy(id="input-password")
	 private WebElement passwordField;
	 
	 
	 @FindBy(xpath = "//input[@value='Login']")
	 private WebElement loginButton;
	 
	 
	 @FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	 private WebElement warningMessage;
	 
	 
	 public void enterEmailAddress(String emailText) {
		 elementutil.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		 //emailField.sendKeys(emailText);
	 }
	 
	 
	 public void enterPassword(String password) {
		 ///passwordField.sendKeys(password);
		 elementutil.typeTextIntoElement(passwordField, password, CommonUtils.EXPLICIT_WAIT_BASIC_TIME); 
	 }
	 
	 public AccountPage 	clickOnLoginButton() {
		 elementutil.clickOnElement(loginButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		 //loginButton.click();
		 return new AccountPage(driver);
	 }
	 
	 public String getWarningMessageText() {
		return elementutil.getTextFromElement(warningMessage, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		 //return warningMessage.getText();
	 }
	 
	 

}
