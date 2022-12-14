package pages;

import common.Browserhelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static common.Browserhelper.*;
import static common.Browserhelper.driver;

public class Opportunity {

    WebDriver driver = null;


    public Opportunity(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_opportunity(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);

        driver.navigate().to("https://cunning-bear-viyty0-dev-ed.trailblaze.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");
    }

public void createopportunity(WebDriver driver){
    driver.findElement(By.xpath("//div[@id='brandBand_1']/div/div/div/div/div/div/div[2]/ul/li/a")).click();
    driver.findElement(By.xpath("//sfa-input-opportunity-amount/lightning-input/div/input")).sendKeys("150");

    driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).sendKeys("CDI TALAN");
    driver.findElement(By.xpath("//lightning-datepicker/div/div/input")).sendKeys("13/12/2022");

    driver.findElement(By.xpath("//lightning-base-combobox/div/div/button")).click();
    driver.findElement(By.xpath("//lightning-base-combobox-item[3]/span[2]/span")).click();
    driver.findElement(By.xpath("//li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot/slot/lightning-button/button")).click();

}
public void verifiercreationopportunity(WebDriver driver){
    String message = driver.findElement(By.xpath("//lightning-base-combobox/div/div/button")).getText();
    Assert.assertNotEquals(message,"Opportunité à été bien enregistréé");
}

public void selectopportunity(WebDriver driver){
    driver.findElement(By.xpath("//th/span/a")).click();
}
public void cliquerbuttonmodifier(WebDriver driver){
    driver.findElement(By.xpath("//div[@class='highlights slds-clearfix slds-page-header slds-page-header_record-home fixed-position']//div[@class='slds-grid primaryFieldRow']//div[@class='slds-col slds-no-flex slds-grid slds-grid_vertical-align-center horizontal actionsContainer']//div//button[@name='Edit'][normalize-space()='Modifier']")).click();

}
public void modifieropportunity(WebDriver driver){
    driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).click();
    driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).clear();
    driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).sendKeys("CDI TALAN FRANCE");

}
public void enregistrermodification(WebDriver driver){
    //driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).click();
    driver.findElement(By.xpath("//li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot/slot/lightning-button/button")).click();

}

public void selectopportunity_to_delete(WebDriver driver) throws Exception {
    driver.findElement(By.xpath("//lightning-input/div/input")).click();
    driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys("CDI TALAN");


   Browserhelper.clickOnElement(driver,driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modifier Nom du compte : élément 1'])[1]/preceding::a[1]")));
}

public void supprimeropportunity(WebDriver driver) throws Exception {
        Thread.sleep(2000);
    driver.findElement(By.xpath("//lightning-button-menu/button")).click();
    driver.findElement(By.xpath("//runtime_platform_actions-ribbon-menu-item/a")).click();
    Browserhelper.clickOnElement(driver, driver.findElement(By.xpath("//*/text()[normalize-space(.)='Supprimer']/parent::*")));
    driver.findElement(By.xpath("//*/text()[normalize-space(.)='Supprimer']/parent::*"));
    Browserhelper.clickOnElement(driver,driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modifier Nom du compte : élément 1'])[1]/preceding::a[1]")));
    Thread.sleep(2000);
    Browserhelper.clickOnElement(driver, driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[2]")));



}
public void verifiersuppression(WebDriver driver){
    System.out.println("************Test finish***************");
}
}
