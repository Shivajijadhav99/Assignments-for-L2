package PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils_files.BasePage;

public class FlightSearchPage extends BasePage {

    @FindBy(id = "roundTrip") // Replace with actual ID
    private WebElement roundTripOption;

    @FindBy(id = "fromCity") // Replace with actual ID
    private WebElement departureCityField;

    @FindBy(id = "toCity") // Replace with actual ID
    private WebElement destinationCityField;

    @FindBy(id = "departure") // Replace with actual ID
    private WebElement departureDateField;

    @FindBy(id = "return") // Replace with actual ID
    private WebElement returnDateField;

    @FindBy(xpath = "//a[contains(text(),'Search')]") // Replace with actual XPATH
    private WebElement searchButton;

    public FlightSearchPage(WebDriver driver) {
        super(driver);
    }

    public void selectRoundTrip() {
        roundTripOption.click();
    }

    public void enterDepartureCity(String departureCity) {
        departureCityField.sendKeys(departureCity);
    }

    public void enterDestinationCity(String destinationCity) {
        destinationCityField.sendKeys(destinationCity);
    }

    public void selectDepartureDate(String departureDate) {
        departureDateField.sendKeys(departureDate);
    }

    public void selectReturnDate(String returnDate) {
        returnDateField.sendKeys(returnDate);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
