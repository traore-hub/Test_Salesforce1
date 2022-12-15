package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Change_owner {
    WebDriver driver = null;

    public Change_owner(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_url_salesforce_change_owner(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu Opportunités'])[1]/following::span[1]")));
    }

    public void check_a_user_in_the_list_then_click_on_the_change_owner_button(WebDriver driver) {
        driver.findElement(By.xpath("//div[@id='brandBand_1']/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[2]/span/span/label/span")).click();
        driver.findElement(By.xpath("//div[@title='Modifier le propriétaire'][contains(text(),'Modifier le propriétaire')]")).click();
    }

    public void click_search_users_and_select_a_user(WebDriver driver) {
        driver.findElement(By.xpath("//div[@class='autocompleteWrapper slds-grow']")).click();
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='brahim bounguicha']/parent::*")).click();
    }

    public void check_send_email_notification(WebDriver driver) {
        driver.findElement(By.xpath("//input[@name='SendEmail']")).click();
    }

    public void click_on_the_submit_button(WebDriver driver) {
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Soumettre']/parent::*")).click();
    }

    public void check_the_displayed_message_owner(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//*/text()[normalize-space(.)='1 propriétaire a été modifié.']/parent::*")).getText();
        Assert.assertNotEquals(message,"1 propriétaire a été modifié");
        System.out.println("Message vérifié");
    }

}
