package PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils_files.BasePage;

public class FlightSelectionPage extends BasePage {

    @FindBy(xpath = "(//div[@class='fli-list one-way'])[4]") 
    private WebElement fourthFlight;

    public FlightSelectionPage(WebDriver driver) {
        super(driver);
    }

    public void selectFourthFlight() {
        fourthFlight.click();
    }
}
