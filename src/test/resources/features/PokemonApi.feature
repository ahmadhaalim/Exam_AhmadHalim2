@Web
Feature: User could get the pokemon name and id
  Scenario: User get the pokemon name and id
    Given User has the name pokemon "pikachu"
    When User request to get by "pikachu"
    And User save the name and id
    And User open the google homepage
    And User input with pokemon name added with "Wikipedia Indonesia" name on input search
    And User press enter on the input search
    And User is in the google search page
    And User click the first search result
    Then User could see the same name
    And User could see the same id

  Scenario: User get the pokemon name and id
    Given User has the name pokemon "charizard"
    When User request to get by "charizard"
    And User save the name and id
    And User open the google homepage
    And User input with pokemon name added with "Wikipedia Indonesia" name on input search
    And User press enter on the input search
    And User is in the google search page
    And User click the first search result
    Then User could see the same name
    And User could see the same id
#
  Scenario: User get the pokemon name and id
    Given User has the name pokemon "bulbasaur"
    When User request to get by "bulbasaur"
    And User save the name and id
    And User open the google homepage
    And User input with pokemon name added with "Wikipedia Indonesia" name on input search
    And User press enter on the input search
    And User is in the google search page
    And User click the first search result
    Then User could see the same name
    And User could see the same id

  Scenario: User get the pokemon name and id
    Given User has the name pokemon "mewtwo"
    When User request to get by "mewtwo"
    And User save the name and id
    And User open the google homepage
    And User input with pokemon name added with "Wikipedia Indonesia" name on input search
    And User press enter on the input search
    And User is in the google search page
    And User click the first search result
    Then User could see the same name
    And User could see the same id