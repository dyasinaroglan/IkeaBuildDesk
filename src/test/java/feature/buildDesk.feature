Feature: build own desk

  # As a {user}  I  want to {login page} so that {...}
  # As a user I want to design my desk so that i can be persuaded to buy a new desk

  #Acceptance Criteria 1 : User should be able to design own desk


  Scenario: designing desk
    Given user on planner page
    And user clicks design own desk
    When  user selects dimension as "large"
    And user selects unit as "units"
    Then price should be 284.99
