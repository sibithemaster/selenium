package Cucumber.Stepdefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition {

	@Given("User is on banking homepage")
	public void user_is_on_banking_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Landing into the homepage");
	}

	@When("^User enter into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@When("^User enter in to application with (.+) and (.+)$")
	public void user_enter_in_to_application_with_and(String username, String password) throws Throwable {
		System.out.println(username+ " "+ password);
	}


	@Then("Pop up message displayed on homepage")
	public void pop_up_message_displayed_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Pop up message displayed");
	}

	@When("^User enter into application for sign up$")
	public void user_enter_into_application_for_sign_up(DataTable data) throws Throwable {
		List<List<String>> signUp=data.asLists();

		System.out.println( signUp.get(0).get(0) );
		System.out.println( signUp.get(0).get(1) );
		System.out.println( signUp.get(0).get(2) );
		System.out.println( signUp.get(0).get(3) );
		System.out.println( signUp.get(0).get(4) );
	}

	@And("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed_something(String strArg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Card types displayed");
		System.out.println(strArg1);
	}

}

//for(int i=0;i<signUp.size();i++)
//{
//	for(int j=0;j<;j++)
//	{
//		
//	}
//}
