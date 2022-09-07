@register_negatif
Feature: Register

  Scenario: user create account without fullname
    Given user alredy in web Sport Arena
    And user alredy on register page
    When user input new account without fullname required field only
    And user click button register
    Then user can see show popup alert message register failed

  Scenario: user create account with email without "@domain"
    Given user alredy in web Sport Arena
    And user alredy on register page
    When user input new account in email without domain required field only
    Then user can see show alert message email tidak valid

  Scenario: user create account with registered email
    Given user alredy in web Sport Arena
    And user alredy on register page
    When user input registered account with required field only
    And user click button register
    Then user can see show popup alert message register failed