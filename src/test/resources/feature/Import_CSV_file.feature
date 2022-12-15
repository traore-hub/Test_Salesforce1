@Import_CSV
Feature: TestSalesforce
  I want to use this template for my feature file

  Scenario: Import CSV file
    Given navigate to url salesforce import file
    When Click on the import button
    And Click the object tracking arrow Standard
    And Click on Add New Registered
    And Select Name to map the track
    And Select Other for Assign new tracks to this source
    And Select Standard for Assign alltracks
    And Check Use rule settings
    And Click on CSV and choose a CSV file
    And Click on the Next1 button
    And Click on the map link
    And Select Last Name, First Name, Campaign Member: Campaign, Country, Address
    And Click on the Map button
    And Click on the Start import button
    Then Click on the OK button