package stepdef;

import common.Browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.Change_status;
import pages.Connexion;
import pages.Create_track;

import static common.Browserhelper.driver;

public class Change_status_Step {

    Change_status status;
    Connexion connexion;


    @Given("navigate to url salesforce status")
    public void navigate_to_url_salesforce_status() throws Throwable {
        status = new Change_status(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
        status.navigate_to_url_salesforce_status(driver);}


    @When("select an account for change status")
    public void select_an_account_for_change_status() throws InterruptedException {
       status.select_an_account_for_change_status(driver);
    }

    @When("Click on the button change status")
    public void click_on_the_button_change_status() throws InterruptedException {
       status.click_on_the_button_change_status(driver);
    }

    @When("Select working")
    public void select() throws InterruptedException {
        status.select(driver);
    }

    @When("Click on the Save button")
    public void click_on_the_save_button() throws InterruptedException {
        status.click_on_the_save_button(driver);
    }

    @Then("Check the displayed Message status")
    public void Check_the_displayed_Message_status() throws InterruptedException {
        status.Check_the_displayed_Message_status(driver);
        driver.quit();
    }

}
