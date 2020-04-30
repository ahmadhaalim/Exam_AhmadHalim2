@Android
Feature: Complete Check To Do

  Scenario: User can check complete on to do
    Given User in the main page
    And User have one to do unchecked with title "title"
    When User check the the to do
    Then To do is checked