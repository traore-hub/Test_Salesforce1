@Tache
Feature: tache
  @creationTache
  Scenario: creation tache
    Given Se connecter sur saleforce
    And cliquer sur tache 
    When Cliquer sur une nouvelle tache
    And Entrer lobjet 
    And Selectionner le priorité
    Then Selectionner le statut 
    And Cliquer sur enregistrer   
   @modificationTache
  Scenario: modification tache
   Given Se connecter sur saleforce
    And cliquer sur tache 
    When Chercher la tache par le nom 
    And Selectionner la tache 
    And Cliquer sur modifier 
    Then Modifier objet avec le nom "nouvelle_tache_test_brahim"
    And Modifier le statut
    And Modifier le priorité 
    And Cliquer sur enrigistrer modification tache
    @suppressionTache
  Scenario: supprimer une  tache
   Given Se connecter sur saleforce
    And cliquer sur tache 
    When Chercher la tache par le nom 
    And Selectionner la tache 
    And Cliquer sur supprimer 