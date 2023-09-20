package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtil;

public class SearchResultsPage {
	
	
	WebDriver driver;
	private ElementUtil elementUtil;
	
public SearchResultsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtil=new ElementUtil(driver);
		
	}


@FindBy(linkText="HP LP3065")
private WebElement validHPProduct;

@FindBy(xpath="//input[@id='button-search']/following-sibling::p")
private WebElement messageText;


public boolean displayStatusOfValidProduct() {
	return elementUtil.displayStatusOfElement(validHPProduct, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	//return validHPProduct.isDisplayed();
	
}

public String getMessageText() {
	return elementUtil.getTextFromElement(messageText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	//return messageText.getText();
	
}

}
