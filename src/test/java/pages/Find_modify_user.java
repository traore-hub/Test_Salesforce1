package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Find_modify_user {
    WebDriver driver = null;

    public Find_modify_user(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_url_salesforce_modify_user(WebDriver driver) {
        //driver.navigate().to("https://resilient-unicorn-h8vtzx-dev-ed.trailblaze.lightning.force.com/lightning/o/Lead/list?filterName=Recent");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu Opportunités'])[1]/following::span[1]")));
    }

    public void type_in_the_search_bar(WebDriver driver,String user) {
        driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys(user);
    }

    public void click_on_of_the_list(WebDriver driver) {
        driver.findElement(By.xpath("//th/span/a")).click();
    }

    public void click_on_the_edit_button(WebDriver driver) {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('Afficher plus d', \"'\", 'actions')])[2]/preceding::button[2]")).click();
    }

    public void enter_the_email(WebDriver driver,String email){
        driver.findElement(By.xpath("//records-record-layout-row[4]/slot/records-record-layout-item[2]/div/span/slot/lightning-input/div/input")).clear();
        driver.findElement(By.xpath("//records-record-layout-row[4]/slot/records-record-layout-item[2]/div/span/slot/lightning-input/div/input")).sendKeys(email);
    }

    public void click_on_the_save_button_modify(WebDriver driver) {
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    }

    public void check_the_displayed_message_modify(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='success'])[1]/following::span[1]")).getText();
        Assert.assertNotEquals(message,"Piste \"Mrs. Mariem Taieb\" a été enregistré(e)");
        System.out.println("Message vérifié");
    }

}
