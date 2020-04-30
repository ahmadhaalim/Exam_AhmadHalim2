@Android
Feature: Create todo task
Scenario: User could add todo with title and description from todo page, to task list
  Given User in the add page
  When User input the title "First To Do" to the input title
  And User input the desc "Do this task" to the description
  And User click the checkmark button
  Then User back to the main page
  And User can see the new todolist "First To Do"

Scenario: User could add todo with only title from todo page, to task list
  Given User in the add page
  When User input the title "Second To Do" to the input title
  And User click the checkmark button
  Then User back to the main page
  And User can see the new todolist "Second To Do"

Scenario: User could add todo with only description from todo page, to task list
  Given User in the add page
  When User input the desc "Do this task" to the description
  And User click the checkmark button
  Then User back to the main page
  And User can see the new todolist "Do this task"