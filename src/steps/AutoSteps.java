package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoSteps extends BaseClass{

	public AutoSteps() {
		initClasses(driver);
	}
	
	@Given("user select auto")
	public void user_select_auto() {
		landingPage.clickAuto(commonActions);
	}

	@When("user input {string} in zipcode")
	public void user_input_in_zipcode(String string) {
		zipCodePage.inputZipCode(commonActions,string);
	}

	@When("user clicks startquote button")
	public void user_clicks_startquote_button() {
		zipCodePage.clickQuoteBtn(commonActions);
	}

	@Then("user will navigate to personal details page")
	public void user_will_navigate_to_personal_details_page() {
		commonActions.sleep(4);
		commonActions.getUrl();
	}
	
	@When("user enters their personal details")
	public void user_fill_personal_details_page() {
		startPersonalDetailsPage.startPersonalDetailsPageSteps(commonActions, "Mike", 'H', "Doe","II", "11/04/1987",
				"12312 Liberty Avenue", "2B", "Jamaica", true);
	}
	
	@Then("user will navigate to vehicle page")
	public void user_will_be_in_vehicle_page() {
		commonActions.sleep(4);
		commonActions.getUrl();
	}

}
