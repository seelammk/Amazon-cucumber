package StepDefnitions;


import org.openqa.selenium.By;

public class Login {
    private static final String usernameXPath = "//input[@id='login_username']";
    private static final String passwordXPath = "//input[@id='login_password']";
    private static final String loginXPath = "//button[text()='Sign In']";

    public static void login(String username, String pwd) {
        SeleniumUtils.driver.findElement(By.xpath(usernameXPath)).sendKeys(new CharSequence[] {username});
        SeleniumUtils.driver.findElement(By.xpath(passwordXPath)).sendKeys(new CharSequence[] {pwd});
        SeleniumUtils.driver.findElement(By.xpath(loginXPath)).click();
    }
}
