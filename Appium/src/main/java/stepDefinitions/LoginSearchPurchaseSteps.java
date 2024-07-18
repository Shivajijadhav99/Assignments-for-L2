package stepDefinitions;

import org.openqa.selenium.WebDriver;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class LoginSearchPurchaseSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    SearchPage searchPage = new SearchPage(driver);
    ProductPage productPage = new ProductPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Given("the user is on the Flipkart login screen")
    public void the_user_is_on_the_Flipkart_login_screen() {
        driver.get("https://www.flipkart.com");
        loginPage.ensureLoginScreenIsVisible();
    }

    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @When("the user searches for {string}")
    public void the_user_searches_for(String product) {
        searchPage.searchProduct(product);
    }

    @When("the user adds the second item to the cart")
    public void the_user_adds_the_second_item_to_the_cart() {
        searchPage.addSecondItemToCart();
    }

    @Then("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        checkoutPage.proceedToCheckout();
    }
}
