package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.Change_owner;
import pages.Change_status;
import pages.Connexion;

import static common.Browserhelper.driver;

public class Change_owner_Step {

    Change_owner owner;
    Connexion connexion;

    @Given("navigate to url salesforce change owner")
    public void navigate_to_url_salesforce_change_owner() throws Throwable {
        owner = new Change_owner(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
        owner.navigate_to_url_salesforce_change_owner(driver);}

    @When("Check a user in the list then click on the Change owner button")
    public void check_a_user_in_the_list_then_click_on_the_change_owner_button() {
        owner.check_a_user_in_the_list_then_click_on_the_change_owner_button(driver);
    }
    @Test
    @When("Click Search Users and select a user")
    public void click_search_users_and_select_a_user() {
       owner.click_search_users_and_select_a_user(driver);
    }

    @When("Check Send email notification")
    public void check_send_email_notification() {
        owner.check_send_email_notification(driver);
    }

    @When("Click on the submit button")
    public void click_on_the_submit_button() {
        owner.click_on_the_submit_button(driver);
    }

    @When("Check the displayed message owner")
    public void check_the_displayed_message_owner() throws InterruptedException {
        owner.check_the_displayed_message_owner(driver);
        driver.quit();
    }

}
