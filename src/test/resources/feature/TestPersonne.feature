@TestPersonne
Feature: TestSalesforce
  I want to use this template for my feature file

  @Modify_user
  Scenario: Find and modify a user
    Given navigate to url salesforce modify user
    When Type "mariem taieb" in the search bar
    And Click on mariem taieb of the list
    And Click on the Edit button
    And Enter the email "mariemtaieb66@gmail.com"
    And Click on the Save button_modify
    Then Check the displayed message_modify

  @Delete_user
  Scenario: Find and delete a user
    Given navigate to url salesforce delete
    When Enter the name "mariem taieb" in the search2 bar
    And Click on mariem taieb of the listusers
    And Click on the arrow
    And Select Delete
    And Click on the Delete button
    Then Check the displayed message_delete