@xvp-2034
Feature: Validating Auto Insurance Feature

  @dataDriven
  Scenario Outline: Validating Landing Page
    Given user select auto
    When user input <zip> in zipcode
    And user clicks startquote button
    Then user will navigate to personal details page
    Examples:
    |zip		|
    |'11423'|
    |'10467'|
   	|'11418'|
    
  @anyname
  Scenario: Validating Landing Page and Personal Details Page
    And user select auto
    When user input '10473' in zipcode
    And user clicks startquote button
    Then user will navigate to personal details page
    When user enters their personal details
    Then user will navigate to vehicle page
