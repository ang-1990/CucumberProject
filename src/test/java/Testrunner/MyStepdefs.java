package Testrunner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {


    @Then("^Driver starts journey$")
    public void driverStartsJourney() {
    }

    @And("^Driver ends the journey$")
    public void driverEndsTheJourney() {
    }

    @Then("^user pays (\\d+) MXN$")
    public void userPaysMXN(int fee) {
    }

    @When("The car is selected and pick up is {string} and drop is {string}")
    public void theCarIsSelectedAndPickUpIsAndDropIs(String startingPoint, String dropdown) {
        System.out.println("The journey is " + startingPoint + dropdown);
    }

  @Given("User wants to select a car {string} from uber app")
  public void userWantsToSelectACarFromUberApp(String cartType) {
    System.out.println("The car type is " + cartType);
  }
}
