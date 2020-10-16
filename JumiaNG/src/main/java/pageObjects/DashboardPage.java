package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }


    //Using By to locate page elements
    private By categoryMenu = By.xpath("//*[@id=\"jm\"]/header/section/div/div[1]/div");
    private By subcat  = By.linkText("Home & Office");
    private By topbaruser  = By.xpath("//*[@id=\"jm\"]/header/section/div/div[2]/div[1]/label");
    private By logoutButton = By.xpath("//*[@id=\"dpdw-login-box\"]/div/form/button");


    public void categoryMenu () throws InterruptedException {

        //Wait for 10 seconds before executing the action
        Thread.sleep(10000);

        //Find the categoryMenu element and click on the categoryMenu link

        driver.findElement(categoryMenu).click();
    }

    public void subcat() throws InterruptedException {

        //Wait for 10seconds before executing the action
        Thread.sleep(10000);

        //find the logout element and click on the logout button
        driver.findElement (subcat).click();

    }

    public void topbaruser() throws InterruptedException {

        //Wait for 10seconds before executing the action
        Thread.sleep(10000);

        //find the topbaruser element and click on the topbaruser link
        driver.findElement (topbaruser).click();

}

public LogInPage clickLogout() throws InterruptedException {

        //Wait for 10seconds before executing the action
        Thread.sleep(10000);

        //find the logout element and click on the logout button
        driver.findElement (logoutButton).click();

        return new LogInPage(driver);

    }
}
