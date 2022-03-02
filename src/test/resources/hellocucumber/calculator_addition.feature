Feature: Calculator Addition
  As a user
  I want to use a calculator to add numbers
  So that I don't need to do it myself

#  Scenario: Add two numbers -2 & 3
#    Given I have a calculator
#    When I add -2 and 3
#    Then the result should be 1
#
#  Scenario: Add two numbers 10 & 15
#    Given I have a calculator
#    When I add 10 and 15
#    Then the result should be 25

  Scenario Outline: Add two numbers <num1> & <num2>
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>

    Examples:
      | num1 | num2 | total |
      | -2 | 3    | 1   |
      | 10 | 15   | 25  |
      | 99 | -99  | 0   |
      | -1 | -10  | -11 |


  Scenario Outline: Subtract two numbers <num1> & <num2>
    Given I have a calculator
    When I subtract <num2> from <num1>
    Then the result should be <total>

    Examples:
      | num1 | num2 | total |
      | -2 | 3    | -5  |
      | 10 | 15   | -5  |
      | 99 | -99  | 198 |
      | -1 | -10  | 9   |


  Scenario Outline: Multiply two numbers <num1> & <num2>
    Given I have a calculator
    When I multiply <num1> and <num2>
    Then the result should be <total>

    Examples:
      | num1 | num2 | total |
      | -2 | 3    | -6   |
      | 10 | 15   | 150  |
      | 99 | -99  | -9801|
      | -1 | -10  | 10  |


  Scenario Outline: Divide two numbers <num1> & <num2>
    Given I have a calculator
    When I divide <num1> by <num2>
    Then the result should be <total>

    Examples:
      | num1 | num2 | total |
      | 1 | 1     | 1    |
      | 15 | 3    | 5    |
      | 99 | -99  | -1   |
      | 2500 | 2  | 1250 |