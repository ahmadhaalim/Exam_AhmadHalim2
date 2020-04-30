@Android
Feature: Check Statistic

  Scenario: User can see that User has one active task Statistic Page
    Given User in the main page
    And User have one to do unchecked with title "title"
    When User click the three bar menu
    And User click statistic menu
    Then User can see the amount of active task