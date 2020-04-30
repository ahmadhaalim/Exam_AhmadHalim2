@Android
Feature: User can filter active to-do
  Scenario: User can select to only view active todo
    Given User in the main page
    And User have one to do unchecked with title "title"
    When User click the filter menu
    And User click the Active tab
    Then User see the Active to do label
    And User see only "title" active todo
    And User see its unchecked