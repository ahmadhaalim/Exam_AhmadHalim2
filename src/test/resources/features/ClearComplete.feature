@Android
Feature: User clear complete todo

  Scenario: User can clear completed to do using using the clear completed menu
    Given User in the main page
    And User have one to do checked with title "title"
    When User click the three dot menu
    And User click the clear menu
    Then User completed to do is gone
