Feature: Adding a new car

  Scenario: Successfully adding a car
    Given User launches Chrome browser
    When User opens ilCarro Home Page
    And User enters LetTheCarWork
    And User enters car details:
    And User adding photo
    And User clicks Submit button
    Then User successfully added new car
    And User quites browser