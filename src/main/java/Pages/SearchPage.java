package Pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;
    Logger log;

    @FindBy(id = "com.flipkart.android:id/search_widget_textbox")
    private WebElement searchBox;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc='Product Image'])[2]")
    private WebElement secondProduct;

    @FindBy(id = "com.flipkart.android:id/product_add_to_cart")
    private WebElement addToCartButton;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String product) {
        searchBox.sendKeys(product);
        searchBox.submit();
        log.info("User searched for product: " + product);
    }

    public void addSecondItemToCart() {
        secondProduct.click();
        addToCartButton.click();
        log.info("Second item added to cart.");
    }
}
