package LogIn;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import setUp.setUpTests;

public class LogInTests extends setUpTests {
    //private LogInPage logInPage;

    @Test(priority = 1)
    public void testLogIn() throws InterruptedException{

        logInPage.enterEmail("coolwas2000@gmail.com");
        logInPage.enterPassword("monsterT");

        DashboardPage dashboardPage = logInPage.clickloginButton();
        dashboardPage.topbaruser();
        logInPage = dashboardPage.clickLogout();
        System.out.println("Account logged out");

        //Check whether the pageTitle is correct
        String pageTitle = "Jumia";
        if (pageTitle.equalsIgnoreCase("Jumia")){
            System.out.println("The page title is "+ pageTitle);
        } else System.out.println("The page title is incorrect. Actual page title is " + pageTitle);
    }
}
