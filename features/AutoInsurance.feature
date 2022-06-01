Feature: Validating Auto Insurance Feature

  Scenario: 
    Given when user is in homepage
    When user input '11428' in zipcode
    And user clicks startquote button
    Then user will navigate to personal details page
