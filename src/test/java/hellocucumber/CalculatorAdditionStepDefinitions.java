package hellocucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAdditionStepDefinitions {

    private int total;
    private Calculator calculator;

    public CalculatorAdditionStepDefinitions() {
    }

    @Before
    private void init() {
        total = -999;
    }

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        total = calculator.add(int1, int2);
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        assertEquals(int1, total);
    }

}
