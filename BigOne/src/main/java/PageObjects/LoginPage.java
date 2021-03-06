package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    By username = By.xpath("//input[@id='user_email']");
    By password = By.xpath("//input[@id='user_password']");
    By logBtn = By.xpath("//input[@name='commit']");

    public LoginPage(WebDriver driver) {

        this.driver=driver;

    }

    public WebElement Username () {

        return driver.findElement(username);

    }

    public WebElement Password () {

        return driver.findElement(password);

    }
    public WebElement LoginButton () {

        return driver.findElement(logBtn);

    }

}
