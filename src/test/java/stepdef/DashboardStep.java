package stepdef;

import org.openqa.selenium.WebDriver;

import pages.Dashboard;
import pages.Connexion;
import common.Browserhelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DashboardStep {
	Dashboard dashboard ;
	Connexion connexion;



		@Given("User is on sales section.")
		public void user_is_on_sales_section() throws Throwable {
			//Dashboard.verifPageTitle(Browserhelper.driver, "Accueil | Salesforce");
			connexion = new Connexion(Browserhelper.driver);
			connexion.seconnecter(Browserhelper.driver);
		}
		
		@When("User create  a new Dashboard.")
		public void i_create_a_dashboard() throws InterruptedException {
		 Dashboard.clickDB(Browserhelper.driver);
		  Thread.sleep(2000);
		  
			}
		
		
		@And("User Fill the dashboard informations.")
		public void user_fill_the_dashboard_informations() throws InterruptedException {
		  Dashboard.fullDB(Browserhelper.driver);
		}

		@Then("Dashboard created successfully.")
		public void dashboard_created_successfully() {
			//Browserhelper.driver.close();
	}
	@Given("User is on sales page.")
	public void user_is_on_sales_page() throws Throwable {
		//Dashboard.verifPageTitle(Browserhelper.driver, "Accueil | Salesforce");
		connexion = new Connexion(Browserhelper.driver);
		connexion.seconnecter(Browserhelper.driver);
	}

	@When("User create a new folder.")
	public void user_create_a_new_folder() throws InterruptedException {
		Dashboard.createNewFolder(Browserhelper.driver);   
	}

	@And("User fill the folder informations.")
	public void user_fill_the_folder_informations() throws InterruptedException {
	    Dashboard.fullFolder(Browserhelper.driver);
	}

	@Then("a new folder for saving is created.")
	public void a_new_folder_for_saving_is_created() {
	    
	}
	@Given("User is on Dashboard section.")
	public void user_is_on_dashboard_section() throws Throwable {
		connexion = new Connexion(Browserhelper.driver);
		connexion.seconnecter(Browserhelper.driver);
		Dashboard.dashboardPage(Browserhelper.driver); 
}

		@When("User choose an exsiting Dashboard to modify.")
	public void user_choose_an_exsiting_dashboard_to_modify() throws InterruptedException {
	    Dashboard.chooseDB(Browserhelper.driver);
	}
	
	@And("User choose a compount and add it to the existing dashboard.")
	public void user_choose_a_compountand_add_it_to_the_existing_dashboard() throws InterruptedException {
	   Dashboard.addCompount(Browserhelper.driver);
	}
	
	@Then("User save the modification")
	public void user_save_the_modification() {
	}
}