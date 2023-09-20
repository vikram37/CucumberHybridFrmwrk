package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtil;

public class AccountPage {
	
	
	WebDriver driver;
	private ElementUtil elementUtil;
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		elementUtil=new ElementUtil(driver);
	}
	
	@FindBy(linkText = "Edit your account information")
	private WebElement editYourAccountInfo;
	
	public boolean displayStatusOfEditYourAccountInformation() {
		
		return elementUtil.displayStatusOfElement(editYourAccountInfo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//return editYourAccountInfo.isDisplayed();
	}

}
