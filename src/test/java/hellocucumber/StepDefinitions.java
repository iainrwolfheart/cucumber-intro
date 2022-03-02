package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

// This would be the class under test in actual code
class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is_friday(String day) {
        today = day;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_is_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}
