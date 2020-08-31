package pages;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Mozilla {


    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine

        FirefoxDriver driver = new FirefoxDriver(options);
        driver.get("http://www.google.com");
    }
}
