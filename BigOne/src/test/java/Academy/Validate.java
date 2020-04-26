package Academy;

import PageObjects.landingPage;
import Resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.IOException;

public class Validate extends Base {

  //  public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void North() throws IOException {

        driver = initializeDriver();
        //log.info("Good");
        driver.get(prop.getProperty("url"));
        //log.info("Navigated to Homepage");
    }

    @Test
    public void basePageNav() {


        landingPage start = new landingPage(driver);
        // start.getTitle().getText();
        //Assert.assertEquals(start.getTitle().getText(), "FEATURED COURSES");
        Assert.assertTrue((start.getHeader().isDisplayed()));
        //log.info("Headers are displayed");

    }

    @AfterTest
    public void South() {

        driver.quit();
        driver=null;


    }

}

