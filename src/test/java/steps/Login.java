package steps;

import java.time.Duration;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonUtils;

public class Login {
	WebDriver driver;
	private  LoginPage loginpage;
	private AccountPage accountPage;
	private CommonUtils commonutils;
	
	
	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() {
		 
		
		driver=DriverFactory.getDriver();
		HomePage homePage=new HomePage(driver);
		homePage.clickOnMyAccount();
		
		
		loginpage=homePage.selectLoginOption();
	}

//	@When("User enters valid email address {string} into email field")
//	public void user_enters_valid_email_address_into_email_field(String emailid) {
//		
//		
//		
//		loginpage.enterEmailAddress(emailid);
//		
//	}

//	@When("User has entered valid password {string} into password field")
//	public void user_has_entered_valid_password_into_password_field(String passwordText) {
//		
//		loginpage.enterPassword(passwordText);
//	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		accountPage=loginpage.clickOnLoginButton();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		//Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		//new AccountPage(driver);
		Assert.assertTrue(accountPage.displayStatusOfEditYourAccountInformation());
	}

	@When("User enters invalid email address  into email fie")
	public void user_enters_invalid_email_address_into_email_fie() {
		
		commonutils=new CommonUtils();
		loginpage.enterEmailAddress(commonutils.getEmailWithTimeStamp());
		
		}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidpassword) {
		loginpage.enterPassword(invalidpassword);
		//driver.findElement(By.id("input-password")).sendKeys(invalidpassword);
	}

	@Then("User should get a proper warning message about credentials mismatch I")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch_i() {
		
		Assert.assertTrue(loginpage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
		//Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

//	@When("User enters valid password {string} into password field")
//	public void user_enters_valid_password_into_password_field(String passwordText) {
//		
//		loginpage.enterPassword(passwordText);
//		//driver.findElement(By.id("input-password")).sendKeys(passwordText);
//	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
		//Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		Assert.assertTrue(loginpage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {
		//loginpage=new LoginPage(driver);
		loginpage.enterEmailAddress("");
		//driver.findElement(By.id("input-email")).sendKeys("");
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
		
		loginpage.enterPassword("");
		//driver.findElement(By.id("input-password")).sendKeys("");
	}
	
	
	@When("^User enters valid email address (.+) into email field$")
	public void User_enters_valid_email_address_into_email_field(String emailText) {
		
		loginpage.enterEmailAddress(emailText);
		
	}
	
	@And("^User enters valid password (.+) into password field$")
	public void user_enters_valid_password_into_password_field(String passwordText) {
	    
		loginpage.enterPassword(passwordText);
		
	}
	
//	private String getEmailWithTimeStamp() {
//		Date date=new Date();
//		return "abcdf"+date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
//	}

}
