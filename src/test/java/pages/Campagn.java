package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Campagn {

    WebDriver driver = null;


    public Campagn(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_campagn(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
    driver.navigate().to("https://cunning-bear-viyty0-dev-ed.trailblaze.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");
         }

    public void cliquerbuttoncampagn(WebDriver driver){
        driver.findElement(By.xpath("//li/a/div")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).click();
    }
    public void saisirinfocampagn(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).sendKeys("Campagne de recrutement Stagiaire");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).sendKeys("13/12/2022");
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).sendKeys("01/01/2024");
    }



    public  void clicksavecampagn(WebDriver driver){
        driver.findElement(By.xpath("//button[3]/span")).click();
    }

    public void verify_creation_campagn(WebDriver driver){ String message =driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div/span")).getText();
        System.out.println("le message est :"+message);
        Assert.assertEquals(message,"Campagne est bien crée");
        driver.close();}


    public void chosir_campagn_to_modify(WebDriver driver){
        driver.navigate().to("https://cunning-bear-viyty0-dev-ed.trailblaze.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");


    }

    public void clickbuttoncampagn(WebDriver driver) {
        driver.findElement(By.xpath("//th/span/a")).click();
        driver.findElement(By.xpath("//li[4]/div/div/div/div/a")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Supprimer'])[1]/preceding::a[1]")).click();
    }

    public void change_nomcampagn(WebDriver driver) {
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).sendKeys("recrutement Talan ACADEMY");
    }

    public void change_date_campagn(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).sendKeys("16/11/2022");
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).sendKeys("11/11/2023");
        driver.findElement(By.xpath("//button[3]/span")).click();
    }

    public void verifier_infocampagn(WebDriver driver) {
        String newName = driver.findElement(By.xpath("//div[@id='toastDescription13532:0']/span")).getText();
        System.out.println("le message est: "+ newName);
        Assert.assertEquals(newName,"Recruitement Talan Academy");
    }

}
