@Groupe
Feature: Groupe
  @creation_groupe
  Scenario: creation groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe
    When Cliquer sur un nouveau groupe
    And Entrer le nom " groupe de test " 
    And Selectionner le type daccee
    Then Cliquer sur enregistrer et suivant
    When Cliquer sur charger limage
    And Cliquer sur enregistrer le groupe 
    @modification_groupe
   Scenario: modification groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    And Cliquer sur modifier groupe
    Then Modifier  le nom du groupe "une_nouvelle_modification_groupe"
    And Modifier le Type daccès
    And Cliquer sur enrigistrer modification
    @suppression_groupe
   Scenario: supprimer un groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    And Cliquer sur supprimer groupe
    @creation_opportunite_groupe
   Scenario: creation opportunité dans un groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    Then Cliquer sur nouvelle opportunité 
    And Entrer le nom de lopportunité "opportunité groupe de test "
    And Selectionner etape
    And Cliquer sur enregistrer opportunité
    And  verification  creation  opportunité dans un groupe
    @Ajouter_une_publication_dans_un_groupe
   Scenario: Ajouter une publication dans un groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    Then Cliquer sur publication
    And Ajouter une publication "publication dans un groupe de test groupe de test "
    And Cliquer sur partager publication
    @Ajouter_un_sondage_dans_un_groupe
    Scenario: Ajouter un sondage dans un groupe
    Given Se connecter sur saleforce
    And cliquer sur groupe 
    When Chercher le groupe par le nom 
    And Selectionner le groupe
    Then Cliquer sur sondage
    And Remplir le champs du question
    Then Remplir les champs des choix  
    And Cliquer sur poser une question 

    