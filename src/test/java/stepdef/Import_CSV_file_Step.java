package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Connexion;
import pages.Import_CSV_file;

import java.io.IOException;

import static common.Browserhelper.driver;

public class Import_CSV_file_Step {
    Import_CSV_file import_csv;
    Connexion connexion;
    @Given("navigate to url salesforce import file")
    public void navigate_to_url_salesforce_import_file() throws Throwable {
        import_csv = new Import_CSV_file(driver);
        connexion = new Connexion(driver);
        connexion.seconnecter(driver);
        import_csv.navigate_to_url_salesforce_import_file(driver);
    }

    @When("Click on the import button")
    public void click_on_the_import_button()  {
      import_csv.click_on_the_import_button(driver);
    }

    @When("Click the object tracking arrow Standard")
    public void click_the_object_tracking_arrow_standard() {
        import_csv.click_the_object_tracking_arrow_standard(driver);
    }

    @When("Click on Add New Registered")
    public void click_on_add_new_registered() {
        import_csv.click_on_add_new_registered(driver);
    }

    @When("Select Name to map the track")
    public void select_name_to_map_the_track(){
        import_csv.select_name_to_map_the_track(driver);
    }

    @When("Select Other for Assign new tracks to this source")
    public void select_other_for_assign_new_tracks_to_this_source(){
        import_csv.select_other_for_assign_new_tracks_to_this_source(driver);
    }

    @When("Select Standard for Assign alltracks")
    public void select_Standard_for_assign_alltracks() {
       import_csv.select_Standard_for_assign_alltracks(driver);
    }

    @When("Check Use rule settings")
    public void Check_Use_rule_settings(){
       import_csv.Check_Use_rule_settings(driver);
    }

    @When("Click on CSV and choose a CSV file")
    public void click_on_csv_and_choose_a_csv_file() {
       import_csv.click_on_csv_and_choose_a_csv_file(driver);
    }

    @When("Click on the Next1 button")
    public void click_on_the_next1_button() throws InterruptedException, IOException {
        import_csv.click_on_the_next1_button(driver);
    }

    @When("Click on the map link")
    public void click_on_the_map_link() throws Exception {
        import_csv.click_on_the_map_link(driver);
    }

    @When("Select Last Name, First Name, Campaign Member: Campaign, Country, Address")
    public void select_last_name_first_name_campaign_member_campaign_country_address() {
        import_csv.select_last_name_first_name_campaign_member_campaign_country_address(driver);
    }

    @When("Click on the Map button")
    public void click_on_the_map_button() throws Exception {
        import_csv.click_on_the_map_button(driver);
    }

    @When("Click on the Start import button")
    public void click_on_the_Start_import_button() {
        import_csv.click_on_the_Start_import_button(driver);
    }

    @Then("Click on the OK button")
    public void click_on_the_ok_button() {
        import_csv.click_on_the_ok_button(driver);
        driver.quit();
    }

}
