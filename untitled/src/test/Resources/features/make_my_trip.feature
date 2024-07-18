Feature: Book a round-trip flight on MakeMyTrip

  Scenario: User logs in
    Given I am on the login page
    When I enter valid credentials
    And I click the login button
    Then I should be logged in successfully

  Scenario: User searches for a round-trip flight
    Given I am on the flight search page
    When I search for a round-trip flight from New York to San Francisco
    And I select the fourth available flight
    And I fill in passenger details and proceed until payment
    Then I should be on the payment page
