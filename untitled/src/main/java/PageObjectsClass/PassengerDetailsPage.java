package PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils_files.BasePage;

public class PassengerDetailsPage extends BasePage {

    @FindBy(id = "passengerName") 
    private WebElement passengerNameField;

    @FindBy(id = "proceedToPaymentButton") 
    private WebElement proceedToPaymentButton;

    public PassengerDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void enterPassengerDetails(String name) {
        passengerNameField.sendKeys(name);
    }

    public void proceedToPayment() {
        proceedToPaymentButton.click();
    }
}
