@Create_track
Feature: TestSalesforce
  I want to use this template for my feature file

  Scenario: Track Creation
    Given navigate to url salesforce track
    When Click on the New button
    And Select civility Ms.
    And Enter first "Mariem" and last name "Taieb"
    And Enter company name "Talan"
    And Enter function "Ingénieur test et validation"
    And Click on the Save button track
    Then Check the displayed message track
