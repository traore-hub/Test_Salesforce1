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
import pages.Find_delete_user;

import static common.Browserhelper.driver;

public class Find_delete_user_Step {

    Find_delete_user delete;
    Connexion connexion;

    @Given("navigate to url salesforce delete")
    public void navigate_to_url_salesforce_delete() throws Throwable {
        delete = new Find_delete_user(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
        delete.navigate_to_url_salesforce_track(driver);
    }

    @When("Enter the name {string} in the search2 bar")
    public void enter_the_name_in_the_search2_bar(String name) throws InterruptedException {
      delete.enter_the_name_in_the_search2_bar(driver,name);
    }

    @When("Click on mariem taieb of the listusers")
    public void click_on_of_the_listusers() throws InterruptedException {
        delete.click_on_of_the_listusers(driver);
    }

    @When("Click on the arrow")
    public void click_on_the_arrow() throws InterruptedException {
        delete.click_on_the_arrow(driver);
    }

    @When("Select Delete")
    public void select_delete() {
        delete.select_delete(driver);
    }

    @When("Click on the Delete button")
    public void click_on_the_delete_button() throws InterruptedException {
        delete.click_on_the_delete_button(driver);
    }

    @Then("Check the displayed message_delete")
    public void check_the_displayed_message_delete() throws InterruptedException {
       delete.check_the_displayed_message_delete(driver);
        driver.quit();
    }

}
