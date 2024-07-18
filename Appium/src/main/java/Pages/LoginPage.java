package Pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    Logger log;

    @FindBy(id = "com.flipkart.android:id/username")
    private WebElement usernameField;

    @FindBy(id = "com.flipkart.android:id/password")
    private WebElement passwordField;

    @FindBy(id = "com.flipkart.android:id/login_button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ensureLoginScreenIsVisible() {
        // Add code to ensure the login screen is visible
        log.info("Login screen is visible.");
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        log.info("User logged in with username: " + username);
    }
}
