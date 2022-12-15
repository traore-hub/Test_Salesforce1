package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Change_status {
    WebDriver driver = null;

    public Change_status(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_url_salesforce_status(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu Opportunités'])[1]/following::span[1]")));
    }

    public void select_an_account_for_change_status(WebDriver driver) throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='brandBand_1']/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[2]/span/span/label/span")).click();
    }

    public void click_on_the_button_change_status(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Modifier le statut']/parent::*")).click();
    }

    public void select(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Closed - Not Converted')]")).click();
    }

    public void click_on_the_save_button(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[3]/button[2]")).click();
    }

    public void Check_the_displayed_Message_status(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//*/text()[normalize-space(.)='Le statut de 1 piste a été mis à jour.']/parent::*")).getText();
        Assert.assertNotEquals(message,"Le statut de 1 piste a été mis à jour");
        System.out.println("Message vérifié");
    }

}
