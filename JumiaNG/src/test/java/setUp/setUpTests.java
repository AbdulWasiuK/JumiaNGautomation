package setUp;
import org.testng.annotations.Test;

public class setUpTests extends setUps {
    @Test(priority = 0)
    public void testSetUp (){
        String pageURL = "https://www.jumia.com.ng/customer/account/login/";
        if(pageURL.equalsIgnoreCase( "https://www.jumia.com.ng/customer/account/login/")) {
            System.out.println ("The webpage URL is " + pageURL);
        } else {
            System.out.println ("Invalid URL. Actual webpage URL is " + pageURL);
        }
    }


}
