


Feature: Login, Search, and Purchase on Flipkart

  Scenario: Login, search for products, add the second item to the cart, and proceed to checkout
    Given the user is on the Flipkart login screen
    When the user logs in with username "your_username" and password "your_password"
    And the user searches for "smartphone"
    And the user adds the second item to the cart
    Then the user proceeds to checkout
    