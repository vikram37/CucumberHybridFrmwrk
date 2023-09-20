package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.SearchResultsPage;

public class Search {
	
	WebDriver driver;
	private HomePage homepage;
	private SearchResultsPage searchResultsPage;
	
	@Given("User opens the Application")
	public void user_opens_the_application() {
		driver=DriverFactory.getDriver();
		
	    
	}

	@When("User enters valid product {string} into Search box field")
	public void user_enters_valid_product_into_search_box_field(String validProductname) {
		 homepage=new HomePage(driver);
		homepage.enterProductIntoSearchBox(validProductname);
		
		
	    
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() throws InterruptedException {
	    
		 searchResultsPage = homepage.clickOnSearchButton();
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
		
		//SearchResultsPage searchResultsPage=new SearchResultsPage(driver);
		Assert.assertTrue(searchResultsPage.displayStatusOfValidProduct());
		//Assert.fail();
		
	}

	@When("User enters invalid product {string} into Search box field")
	public void user_enters_invalid_product_into_search_box_field(String invalidProduct) throws InterruptedException {
		//   driver.findElement(By.name("search")).sendKeys(invalidProduct);
	    homepage=new HomePage(driver);
	    homepage.enterProductIntoSearchBox(invalidProduct);
	    		
	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	  
		//SearchResultsPage searchResultsPage=new SearchResultsPage(driver);
		Assert.assertEquals("There is no product that matches the search criteria.",searchResultsPage.getMessageText());
	
	}

	@When("User dont enter any product name into Search box field")
	public void user_dont_enter_any_product_name_into_search_box_field() {
	    //left blank
		homepage=new HomePage(driver);
	}




}
