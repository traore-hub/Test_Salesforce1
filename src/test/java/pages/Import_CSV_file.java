package pages;

import common.Browserhelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static common.Browserhelper.driver;

public class Import_CSV_file {

    Import_CSV_file import_file;
    Connexion connexion;
    WebDriver driver = null;

    public Import_CSV_file(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_url_salesforce_import_file(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu Opportunités'])[1]/following::span[1]")));
    }

    public void click_on_the_import_button(WebDriver driver)  {
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Importer']/parent::*")).click();
    }

    public void click_the_object_tracking_arrow_standard(WebDriver driver) {
        WebElement frame= driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[2]/div[2]/section[1]/div/div/section/div/div[2]/div/div/div/force-aloha-page/div/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Pistes']/parent::*")).click();
    }

    public void click_on_add_new_registered(WebDriver driver) {
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Ajouter de nouveaux enregistrements']/parent::*")).click();
    }

    public void select_name_to_map_the_track(WebDriver driver){
        driver.findElement(By.xpath("//select[@id='317:0']")).click();
        driver.findElement(By.xpath("//option[@class='uiInputSelectOption'][contains(text(),'Nom')]")).click();
    }

    public void select_other_for_assign_new_tracks_to_this_source(WebDriver driver){
        driver.findElement(By.xpath("//select[@id='401:0']")).click();
        driver.findElement(By.xpath("//*[@id='401:0']/option[5]")).click();
    }

    public void select_Standard_for_assign_alltracks(WebDriver driver) {
        driver.findElement(By.xpath("//select[@id='433:0']")).click();
        driver.findElement(By.xpath("//*[@id='433:0']/option[1]")).click();
    }

    public void Check_Use_rule_settings(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//input[contains(@class,'uiInput uiInputCheckbox uiInput--default uiInput--checkbox')]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.click();
    }

    public void click_on_csv_and_choose_a_csv_file(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='CSV']/parent::*")).click();
    }

    public void click_on_the_next1_button(WebDriver driver) throws InterruptedException, IOException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[3]/div/div[3]/a/div/div[2]/form")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\mtaieb\\Desktop\\test.exe");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Suivant']/parent::*")).click();
    }

    public void click_on_the_map_link(WebDriver driver) throws Exception {
        Browserhelper.clickOnElement(driver, driver.findElement(By.xpath("//*/text()[normalize-space(.)='Mapper']/parent::*")));
    }

    public void select_last_name_first_name_campaign_member_campaign_country_address(WebDriver driver) {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='lookupLabel'])[1]/following::a[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='lookupLabel'])[1]/following::a[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='lookupLabel'])[1]/following::a[11]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='lookupLabel'])[1]/following::a[15]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='lookupLabel'])[1]/following::a[6]")).click();
    }

    public void click_on_the_map_button(WebDriver driver) throws Exception {
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,250)");
        Browserhelper.clickOnElement(driver, driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='En-tête CSV'])[1]/following::a[1]")));
    }

    public void click_on_the_Start_import_button(WebDriver driver) {
         // *********************************************** boutton suivant ************************************************* //
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Suivant']/parent::*")).click();
        // *********************************************** Démarrer l'importation ************************************************* //
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Chargement'])[1]/preceding::a[1]")).click();
    }

    public void click_on_the_ok_button(WebDriver driver) {
        // *********************************************** Boutton ok ************************************************* //
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Chargement'])[1]/preceding::a[1]")).click();
    }

}
