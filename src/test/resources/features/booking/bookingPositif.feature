@bookingPositif
Feature: Booking

  Scenario: User booked arena with login account
    Given user already on Home page
    And user registered new account
    And user login account registered
    When user booked venue sport arena
    Then user can see price to booked