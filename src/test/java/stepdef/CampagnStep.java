package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Campagn;
import pages.Connexion;
import pages.Opportunity;

import static common.Browserhelper.driver;

public class CampagnStep {
    Campagn campagn;
    Connexion connexion;
    @Given("launch salesforce portals")
    public void launch_salesforce_portals() throws Throwable {
         campagn = new Campagn(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
    }

    /** *******************************Creation  campagn****************************************************************/
    @When("navigate salesforce modules campagn")
    public void navigate_salesforce_modules_campagn() throws InterruptedException {
        campagn.navigate_campagn(driver);
    }
    @When("click button campagn")
    public void click_button_campagn() {
        campagn.cliquerbuttoncampagn(driver);
    }
    @When("give the informations the campagn")
    public void give_the_informations_the_campagn() throws InterruptedException {
       campagn.saisirinfocampagn(driver);
    }
    @When("click save campagn")
    public void click_save_campagn() {
      campagn.clicksavecampagn(driver);
    }
    @Then("verify if campagn is create")
    public void verify_if_campagn_is_create() {
       campagn.verify_creation_campagn(driver);
    }
   /** *******************************Modifications campagn****************************************************************/

    @When("chech campagn list")
    public void chech_campagn_list() {
       campagn.chosir_campagn_to_modify(driver);
    }
    @When("click campagn")
    public void click_campagn() {
        campagn.clickbuttoncampagn(driver);
    }
    @When("change the name")
    public void change_the_name() {
      campagn.change_nomcampagn(driver);
    }
    @When("change date")
    public void change_date() throws InterruptedException {
        campagn.change_date_campagn(driver);
    }
    @Then("verify if campagn name and date is modify")
    public void verify_if_campagn_name_and_date_is_modify() {
       campagn.verifier_infocampagn(driver);
    }
    /** *******************************suppression  campagn****************************************************************/


    @Given("launch salesforce portal")
    public void launch_salesforce_portal() throws Throwable {
        campagn = new Campagn(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);

    }
    @When("navigate to url salesforces")
    public void navigate_to_url_salesforces() throws InterruptedException {
        campagn.navigate_campagn(driver);
    }
    @When("search campagn name")
    public void search_campagn_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("delete this campagn")
    public void delete_this_campagn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
