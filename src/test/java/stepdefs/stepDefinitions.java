package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {


    @Given("^a start state$")
    public void a_start_state() throws Throwable {

    }

    @When("^the state is changed$")
    public void the_state_is_changed() throws Throwable {

    }

    @Then("^I see the state has changed$")
    public void i_see_the_state_has_changed() throws Throwable {

    }

    @Given("^a start state with$")
    public void a_start_state_with(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    }

    @When("^I do stuff$")
    public void i_do_stuff() throws Throwable {

    }

    @Then("^I see result$")
    public void i_see_result() throws Throwable {

    }

    @When("^I do a thing with \"(.*?)\"$")
    public void i_do_a_thing_with(String arg1) throws Throwable {

    }

    @Then("^I see expected result$")
    public void i_see_expected_result() throws Throwable {

    }




}