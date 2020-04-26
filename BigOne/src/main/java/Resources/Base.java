package Resources;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver () throws IOException {


        prop = new Properties();

        FileInputStream fis = new FileInputStream("/Users/Hamro/IdeaProjects/BigOne/src/main/java/Resources/data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();

        }
        else if (browserName.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
           driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("safari")) {

            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();

        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;

        /* public void getScreenShot() {

         File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile (src, new File ("/Users/Hamro/Desktop/Schreenshots.png"));


        }*/



    }

}
