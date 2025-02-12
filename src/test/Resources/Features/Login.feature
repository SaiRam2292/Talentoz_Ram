Feature: Talent oz Login Functionality

  Scenario: Login and check-in to Talent oz
    Given I am on the Talent oz login page
    When I enter the username as "sairam.kankanala@solugenix.com" and password as "Ramsai@143"
    And I click on the Signin button
    Then I should be navigated to the Talent oz home page
    And I click on the check-in button