@Change_owner
Feature: TestSalesforce
  I want to use this template for my feature file

  Scenario: Change Owner
    Given navigate to url salesforce change owner
    When Check a user in the list then click on the Change owner button
    And Click Search Users and select a user
    And Check Send email notification
   And Click on the submit button
   Then Check the displayed message owner
