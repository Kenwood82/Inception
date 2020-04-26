package Academy;

import PageObjects.LoginPage;
import PageObjects.landingPage;
import Resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Inception extends Base {

   // public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void North() throws IOException {

        driver = initializeDriver();
        //log.info("Driver is initialized");
        driver.get(prop.getProperty("url"));
       // log.info("Navigated to Homepage");
        landingPage start = new landingPage(driver);
        start.getLogin().click();
       // log.info("Login Clicked");

    }

    @Test(dataProvider = "getData")
    public void basePageNav(String Username, String Password, String Text) {

       // landingPage start = new landingPage(driver);
        LoginPage go = new LoginPage(driver);


        go.Username().sendKeys(Username);
        go.Password().sendKeys(Password);
        System.out.println(Text);
        //log.info(Text);

    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[2][3];

        data[0][0] = "unrestricted@gmail.com";
        data[0][1] = "123";
        data[0][2] = "Unrestricted User";

        data[1][0] = "restricted@gmail.com";
        data[1][1] = "456";
        data[1][2] = "restricted User";

        return data;


    }

    @AfterTest
    public void South() {
        driver.quit();
        driver=null;


    }


}
