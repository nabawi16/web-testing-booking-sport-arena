@login_negatif
Feature: Login

  Scenario: user login unsuccessfull
    Given user already in login page
    When user already fill wrong email & password
    And user login button clicked
    Then user can see pop up message will appear indicated user not found

  Scenario: user login without password
    Given user already in login page
    When user already fill email
    And user login button clicked
    Then user can see pop up message will appear indicated password incorrect

  Scenario: user login without email
    Given user already in login page
    When user already fill password
    And user login button clicked
    Then user can see pop up message will appear indicated user not found