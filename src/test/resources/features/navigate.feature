Feature: HomePage


  @navigate
  Scenario: Verify HomePage title is displayed
    Given User launches Chrome browser
    When User opens ilCarro Home Page
    Then User verifies HomePage title
    And User quites browser