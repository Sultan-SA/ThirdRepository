package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Utility;

public class SDET_005_StepDefinitions extends Base {
	
	@When("^User click on component dropdown menu should display$")
	public void user_click_on_component_dropdown_menu_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		
	}

	@When("^User click on image of product the product detailed should list on right side of the page$")
	public void user_click_on_image_of_product_the_product_detailed_should_list_on_right_side_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^User should be able to see the blue button with label add to the cart$")
	public void user_should_be_able_to_see_the_blue_button_with_label_add_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User should be able to see success message that products are added to the cart$")
	public void user_should_be_able_to_see_success_message_that_products_are_added_to_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ;
	}
	

}
