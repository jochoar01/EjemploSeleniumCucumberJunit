package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseSelenium {




    private WebDriver driver;


    public BaseSelenium(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver conexionConChrome() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        return driver;

    }

    public WebElement findElement(By locator) {

        return driver.findElement(locator);

    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);

    }

    public String getText(WebElement Element) {

        return Element.getText();
    }

    public String getText(By locator) {

        return driver.findElement(locator).getText();
    }

    public void type(By locator, String inputText) {

        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator) {

        driver.findElement(locator).click();
    }

    public boolean isDisplayed(By locator) {

        try {

            return driver.findElement(locator).isDisplayed();

        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }

    public void visit(String url) {

        driver.get(url);
    }


}
