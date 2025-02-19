package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils_files.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "username") 
    private WebElement usernameField;

    @FindBy(id = "password") 
    private WebElement passwordField;

    @FindBy(id = "login_button") 
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
