package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Find_delete_user {
    WebDriver driver = null;

    public Find_delete_user(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_url_salesforce_track(WebDriver driver) {
        System.out.println("********************************** Create Track **********************************");
        //driver.navigate().to("https://resilient-unicorn-h8vtzx-dev-ed.trailblaze.lightning.force.com/lightning/o/Lead/list?filterName=Recent");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu Opportunités'])[1]/following::span[1]")));
    }

    public void enter_the_name_in_the_search2_bar(WebDriver driver,String name) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys(name);
    }

    public void click_on_of_the_listusers(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//th/span/a")).click();
    }

    public void click_on_the_arrow(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//lightning-button-menu[contains(@class,'menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click')]")).click();
    }

    public void select_delete(WebDriver driver) {
        driver.findElement(By.xpath("//a[@name='Delete']")).click();

    }

    public void click_on_the_delete_button(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Annuler'])[2]/following::span[1]")).click();
    }

    public void check_the_displayed_message_delete(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Chargement...'])[3]/following::div[13]")).getText();
        Assert.assertNotEquals(message,"La piste « Mariem Taieb » a été supprimée");
        System.out.println("Message vérifié");
    }

}
