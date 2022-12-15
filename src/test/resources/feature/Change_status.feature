@Change_status
Feature: TestSalesforce
  I want to use this template for my feature file

  Scenario: Change status
    Given navigate to url salesforce status
    When select an account for change status
    And Click on the button change status
    And Select working
    And Click on the Save button
    Then Check the displayed Message status