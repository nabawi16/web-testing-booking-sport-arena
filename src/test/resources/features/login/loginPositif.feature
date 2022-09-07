@login_positif
Feature: Login

  @user_login
  Scenario: user login successfull
    Given user already in login page
    When user already fill email & password
    And user login button clicked
    Then user can see pop up Successfully logged in

  @admin_login
  Scenario: admin login successfull
    Given admin already in login page
    When admin already fill email & password
    And admin login button clicked
    Then admin can see pop up Successfully logged in

