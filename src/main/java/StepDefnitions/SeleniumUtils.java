package StepDefnitions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtils {
    public static FirefoxDriver driver;
    public static void openApplication(String url){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\PycharmProjects\\RetailSys\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(url);
    }
}