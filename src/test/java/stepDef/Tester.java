package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tester {
	
	@Given("I am a {string} tester")
	public void i_am_a_tester(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I am a "+string+" tester");
	}

	@When("I apply for a job")
	public void i_apply_for_a_job() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I apply for a job");
	}

	@Then("I got {string} paid job")
	public void i_got_paid_job(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I got "+string+" paid job");
	}

	@Then("I am {string} satisfied with the salary")
	public void i_am_satisfied_with_the_salary(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am "+string+" satisfied with the salary");
	}

	@Then("My parents are {string} satisified")
	public void my_parents_are_satisified(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("My parents are  "+string+" satisified");
	}

	@Then("I am not sure about future prospects")
	public void i_am_not_sure_about_future_prospects() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am not sure about future prospects");
	}

}
