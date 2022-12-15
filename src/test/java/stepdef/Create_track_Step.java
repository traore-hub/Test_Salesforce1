package stepdef;

import common.Browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.Connexion;
import pages.Create_track;
import pages.Groupe;
import pages.Tache;

import static common.Browserhelper.driver;

public class Create_track_Step {

    Create_track track;
    Connexion connexion;

    @Given("navigate to url salesforce track")
    public void navigate_to_url_salesforce_track() throws Throwable {
        track = new Create_track(Browserhelper.driver);
        connexion = new Connexion(Browserhelper.driver);
        connexion.seconnecter(Browserhelper.driver);
        track.navigate_to_url_salesforce_track(driver);
    }

    @When("Click on the New button")
    public void click_on_the_new_button() {
        track.click_on_the_new_button(driver);
    }

    @When("Select civility Ms.")
    public void select_civility() {
        track.select_civility(Browserhelper.driver);
    }

    @When("Enter first {string} and last name {string}")
    public void enter_first_and_last_name(String first_name, String last_name){
        track.enter_first_and_last_name(driver,first_name,last_name);
    }

    @When("Enter company name {string}")
    public void enter_company_name(String company) {
        track.enter_company_name(Browserhelper.driver,company);
    }

    @When("Enter function {string}")
    public void enter_function(String function) {
        track.enter_function(Browserhelper.driver,function);
    }

    @When("Click on the Save button track")
    public void click_on_the_save_button_track() {
        track.click_on_the_save_button_track(Browserhelper.driver);
    }

    @Then("Check the displayed message track")
    public void check_the_displayed_message_track() throws InterruptedException {
        track.check_the_displayed_message_track(Browserhelper.driver);
        driver.quit();
    }

}
