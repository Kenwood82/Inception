package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

    public WebDriver driver;

    By signing = By.xpath("//span[contains(text(),'Login')]");
    By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
    By header = By.xpath("//nav[@class='navbar-collapse collapse']");


    public landingPage(WebDriver driver) {

        this.driver=driver;

            }

    public WebElement getLogin () {

        return driver.findElement(signing);

    }

    public WebElement getTitle () {

        return driver.findElement(title);

    }

    public WebElement getHeader () {

        return driver.findElement(header);

    }



}
