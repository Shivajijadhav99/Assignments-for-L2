package PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils_files.BasePage;

public class flightResultPage extends BasePage {

    private WebDriver driver;

    @FindBy(xpath ="(//div[@class='flight-option'])[4]") private WebElement fourthFlightOption; // Replace with actual XPATH

    public flightResultPage(WebDriver driver)
    {
        super(driver);
    }

    public void selectFourthFlight()
    {
        fourthFlightOption.click();
    }
}
