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
    public void i_add(Integer int1, Integer int2) {
        total = calculator.add(int1, int2);
    }

    @When("I subtract {int} from {int}")
    public void i_subtract(Integer int2, Integer int1) {
        total = calculator.subtract(int1, int2);
    }

    @When("I multiply {int} and {int}")
    public void i_multiply(Integer int1, Integer int2) {
        total = calculator.multiply(int1, int2);
    }

    @When("I divide {int} by {int}")
    public void i_divide(int int1, int int2) {
        total = calculator.divide(int1, int2);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int int1) {
        assertEquals(int1, total);
    }

}
