package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LogInPage;

import java.util.concurrent.TimeUnit;

    public class setUps {

        //Create a webDriver
        private WebDriver driver;

        //Create login object
        protected LogInPage logInPage;

        @BeforeTest

        // import chromeDriver
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

            //Instantiate webDriver object
            driver = new ChromeDriver();

            // Maximize the window
            driver.manage().window().maximize();

            // Launch the application URl and wait
            driver.get("https://www.jumia.com.ng/customer/account/login/");

            // Global Waiting period
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Instantiate the login page after launching the browser - Handle
            logInPage = new LogInPage(driver);
        }


        @AfterTest
        public void closeBrowser() {
            driver.quit();
        }

    }
