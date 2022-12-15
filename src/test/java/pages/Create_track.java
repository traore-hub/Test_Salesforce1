package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Create_track {

    WebDriver driver = null;

    public Create_track(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_url_salesforce_track(WebDriver driver) {
        System.out.println("********************************** Create Track **********************************");
        //driver.navigate().to("https://resilient-unicorn-h8vtzx-dev-ed.trailblaze.lightning.force.com/lightning/o/Lead/list?filterName=Recent");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu Opportunités'])[1]/following::span[1]")));
    }

    public void click_on_the_new_button(WebDriver driver) {
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Nouveau']/parent::*")).click();
    }

    public void select_civility(WebDriver driver) {
        driver.findElement(By.xpath("//lightning-base-combobox/div/div/button")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[4]")).click();
    }

    public void enter_first_and_last_name(WebDriver driver, String first_name, String last_name){
        driver.findElement(By.xpath("//div[2]/lightning-input/div/input")).sendKeys(first_name);
        driver.findElement(By.xpath("//div[3]/lightning-input/div/input")).sendKeys(last_name);
    }

    public void enter_company_name(WebDriver driver,String company) {
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).sendKeys(company);
    }

    public void enter_function(WebDriver driver,String function) {
        driver.findElement(By.xpath("//records-record-layout-row[4]/slot/records-record-layout-item/div/span/slot/records-record-layout-base-input/lightning-input/div/input")).sendKeys(function);
    }

    public void click_on_the_save_button_track(WebDriver driver) {
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    }

    public void check_the_displayed_message_track(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='success'])[1]/following::span[1]")).getText();
        Assert.assertNotEquals(message,"Piste \"Ms. Mariem Taieb\" créé(e)");
        System.out.println("Message vérifié");;
    }

}
