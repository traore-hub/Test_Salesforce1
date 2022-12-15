
Feature: Handle the Dashboard section under Sales on salesfore.
  @creationDashboard
  Scenario: Creation of an empty Dashboard.
    Given User is on sales section.
    When User create  a new Dashboard.
    And User Fill the dashboard informations.
    Then Dashboard created successfully.
    
    @CreationFolder
    Scenario: Creation of a folder for saving dashbords.
    Given User is on sales page.
    When User create a new folder.
    And User fill the folder informations.
    Then a new folder for saving is created.
    
    @ModificationDashboard
    Scenario: Modification of an existing Dashboard.
    Given User is on Dashboard section.
    When User choose an exsiting Dashboard to modify.
    And User choose a compount and add it to the existing dashboard.
    Then User save the modification

    
