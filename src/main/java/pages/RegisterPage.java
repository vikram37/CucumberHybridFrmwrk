package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtil;

public class RegisterPage {

	WebDriver driver;
	private ElementUtil elementUtil;

	public RegisterPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);

	}
	
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement passwordConfirmField;
	
	@FindBy(name="agree")
	private WebElement privacyPolicyOption;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement YesNewsletterOption;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement warningMessage;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameWarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameWaring;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailWarning;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneWarning;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordWarning;
	
	
public void enterFirstName(String firstNameText) {
		
	
	elementUtil.typeTextIntoElement(firstNameField, firstNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	//firstNameField.sendKeys(firstNameText);
		
	}
	
public void enterLastName(String lastNameText) {
	elementUtil.typeTextIntoElement(lastNameField, lastNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);	
	//lastNameField.sendKeys(lastNameText);	
		
	}
	
	public void enterEmailAddress(String emailText) {
		elementUtil.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//emailField.sendKeys(emailText);	
		
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		elementUtil.typeTextIntoElement(telephoneField, telephoneText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//telephoneField.sendKeys(telephoneText);
		
	}
	
	public void enterPassword(String passwordText) {
		elementUtil.typeTextIntoElement(passwordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//passwordField.sendKeys(passwordText);
		
	}
	
	public void enterConfirmPassword(String passwordText) {
		elementUtil.typeTextIntoElement(passwordConfirmField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//passwordConfirmField.sendKeys(passwordText);
		
	}
	
	
public void selectPrivacyPolicy() {
	elementUtil.clickOnElement(privacyPolicyOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//privacyPolicyOption.click();
		
	}
	
	public AccountSuccessPage clickOnContinueButton() {
		
		elementUtil.clickOnElement(continueButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//continueButton.click();
		
		return new AccountSuccessPage(driver);
		
	}
	
	public void selectYesNewsletterOption() {
		//YesNewsletterOption.click();
		
		elementUtil.clickOnElement(YesNewsletterOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getWarningMessageText() {
		//return warningMessage.getText();
		
		return elementUtil.getTextFromElement(warningMessage,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getFirstNameWarning() {
		//return firstNameWarning.getText();
		return elementUtil.getTextFromElement(firstNameWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getLastNameWarning() {
		//return lastNameWaring.getText();
		return elementUtil.getTextFromElement(lastNameWaring,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getEmailWarning() {
		//return emailWarning.getText();
		return elementUtil.getTextFromElement(emailWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getTelephoneWarning() {
		//return telephoneWarning.getText();
		return elementUtil.getTextFromElement(telephoneWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	public String getPasswordWarning() {
		//return passwordWarning.getText();
		return elementUtil.getTextFromElement(passwordWarning,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	
}
