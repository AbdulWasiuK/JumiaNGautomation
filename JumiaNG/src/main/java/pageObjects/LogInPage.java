package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LogInPage extends setUps {
    private WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By as a locator to identify the Login fields
    private By Email = By.id ("fi-email");
    private By password = By.id ("fi-password");
    private By loginButton  = By.xpath("//*[@id=\"authForm\"]/button/span");

    public void enterEmail(String umail) {

        //Find the Email element and enter the Email
        driver.findElement(Email).sendKeys(umail);
    }

    public void enterPassword (String pwd) {
        // Find the password and enter the password
        driver.findElement(password).sendKeys(pwd);
    }
    public DashboardPage clickloginButton (){
        //Find the logInButton and click the element
        driver.findElement(loginButton).click ();

        return new DashboardPage (driver);
    }

}
