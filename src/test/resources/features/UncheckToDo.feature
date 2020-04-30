@Android
Feature: Uncheck Completed To Do

  Scenario: User can uncheck complete to do
    Given User in the main page
    And User have one to do checked with title "title"
    When User uncheck the the to do
    Then To do is unchecked