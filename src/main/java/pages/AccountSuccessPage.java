package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtil;

public class AccountSuccessPage {
	
	
WebDriver driver;
private ElementUtil elementUtil;
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		elementUtil=new ElementUtil(driver);
	}
	
	
	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement pageHeading;
	
	public String getPageHeading() {
		return elementUtil.getTextFromElement(pageHeading, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		//return pageHeading.getText();
		
	}


}
