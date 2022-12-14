package stepdef;

import common.Browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Connexion;
import pages.Opportunity;
import pages.Tache;

import static common.Browserhelper.driver;

public class OpportunityStep {
 Connexion connexion;
 Opportunity opportunity;
    @Given("navigate to url salesforce")
    public void navigate_to_url_salesforce() throws Throwable {
        opportunity= new Opportunity(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
    }
    @Given("User navigate to Sales Portal")
    public void user_navigate_to_sales_portal() throws InterruptedException {
        opportunity.navigate_opportunity(driver);
    }
    @When("User Creates An Opportunity with")
    public void user_creates_an_opportunity_with() {
       opportunity.createopportunity(driver);
    }
    @Then("Opportunity should be created with correct information")
    public void opportunity_should_be_created_with_correct_information() {
       opportunity.verifiercreationopportunity(driver);
    }
    @Then("close Browser")
    public void close_browser() {

    }

    @Given("navigate to url salesforce modify")
    public void navigate_to_url_salesforce_modify() throws Throwable {
        opportunity= new Opportunity(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
    }
    @When("user check opportunity list")
    public void user_check_opportunity_list() throws InterruptedException {
        opportunity.navigate_opportunity(driver);
    }
    @When("select opportunity and click")
    public void select_opportunity_and_click() {
        opportunity.selectopportunity(driver);
    }
    @When("click button modify")
    public void click_button_modify() {
       opportunity.cliquerbuttonmodifier(driver);
    }
    @When("modify information the opportunity")
    public void modify_information_the_opportunity() {
       opportunity.modifieropportunity(driver);
    }
    @Then("click save")
    public void click_save() {
        opportunity.enregistrermodification(driver);
    }

    @Given("launch salesforce plateform opportunity list")
    public void launch_salesforce_plateform_opportunity_list() throws Throwable {
        opportunity= new Opportunity(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
        opportunity.navigate_opportunity(driver);
    }
    @When("check opportunity by name")
    public void check_opportunity_by_name() throws Exception {
      opportunity.selectopportunity_to_delete(driver);
    }
    @When("delete this opportunity")
    public void delete_this_opportunity() throws Exception {
        opportunity.supprimeropportunity(driver);
    }
    @Then("verify if opportunity delete")
    public void verify_if_opportunity_delete() {
      opportunity.verifiersuppression(driver);
    }


}
