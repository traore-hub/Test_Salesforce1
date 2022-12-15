package stepdef;

import common.Browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Connexion;
import pages.Find_modify_user;

import static common.Browserhelper.driver;

public class Find_modify_user_Step {

    Find_modify_user modify;
    Connexion connexion;

    @Given("navigate to url salesforce modify user")
    public void navigate_to_url_salesforce_modify_user() throws Throwable {
        modify = new Find_modify_user(Browserhelper.driver);
        connexion = new Connexion(Browserhelper.driver);
        connexion.seconnecter(Browserhelper.driver);
        modify.navigate_to_url_salesforce_modify_user(driver);
    }

    @When("Type {string} in the search bar")
    public void type_in_the_search_bar(String user) {
       modify.type_in_the_search_bar(driver,user);
    }

    @When("Click on mariem taieb of the list")
    public void click_on_of_the_list() {
       modify.click_on_of_the_list(driver);
    }

    @When("Click on the Edit button")
    public void click_on_the_edit_button() {
       modify.click_on_the_edit_button(driver);
    }

    @When("Enter the email {string}")
    public void enter_the_email(String email){
        modify.enter_the_email(driver,email);
    }
    @When("Click on the Save button_modify")
    public void click_on_the_save_button_modify() {
       modify.click_on_the_save_button_modify(driver);
    }

    @Then("Check the displayed message_modify")
    public void check_the_displayed_message_modify() throws InterruptedException {
        modify.check_the_displayed_message_modify(driver);
        driver.quit();
    }


}
