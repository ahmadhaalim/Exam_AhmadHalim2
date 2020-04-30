@Android
Feature: User can filter complete to-do

  Scenario: User can select to only view complete todo
    Given User in the main page
    And User have one to do checked with title "title"
    When User click the filter menu
    And User click the Complete tab
    Then User see the Complete to do label
    And User see only "title" complete todo
    And User see its checked