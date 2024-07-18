package step_definitions;

import PageObjectsClass.FlightSearchPage;
import PageObjectsClass.FlightSelectionPage;
import PageObjectsClass.PassengerDetailsPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import utils_files.ConfigReader;
import utils_files.DriverFactory;
import utils_files.LoggerHelper;


public class mmt_StepDefinitions {

    private static Class<mmt_StepDefinitions> cls;
    private WebDriver driver;
    private pages.LoginPage loginPage;
    private FlightSearchPage flightSearchPage;
    private FlightSelectionPage flightSelectionPage;
    private PassengerDetailsPage passengerDetailsPage;
    private ConfigReader configReader = new ConfigReader();
//    private Logger log = LoggerHelper.cast(mmt_StepDefinitions.class);
    private  Logger log = LoggerHelper.getLogger(mmt_StepDefinitions.cls);

    @Before
    public void setUp() {
        driver = DriverFactory.initializeDriver();
        log.info("Browser opened");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            log.info("Browser closed");
        }
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://www.makemytrip.com/");
        log.info("Navigated to MakeMyTrip homepage");
        loginPage = new pages.LoginPage(driver);
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        loginPage.enterUsername(configReader.getProperty("username"));
        loginPage.enterPassword(configReader.getProperty("password"));
        log.info("Entered valid credentials");
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
        log.info("Clicked login button");
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        // Add assertion to check if the login was successful
        log.info("Logged in successfully");
    }

    @Given("I am on the flight search page")
    public void iAmOnTheFlightSearchPage() {
        flightSearchPage = new FlightSearchPage(driver);
    }

    @When("I search for a round-trip flight from New York to San Francisco")
    public void iSearchForARoundTripFlightFromNewYorkToSanFrancisco() {
        flightSearchPage.selectRoundTrip();
        flightSearchPage.enterDepartureCity(configReader.getProperty("departureCity"));
        flightSearchPage.enterDestinationCity(configReader.getProperty("destinationCity"));
        flightSearchPage.selectDepartureDate(configReader.getProperty("departureDate"));
        flightSearchPage.selectReturnDate(configReader.getProperty("returnDate"));
        flightSearchPage.clickSearchButton();
        log.info("Searched for round-trip flight from New York to San Francisco");
    }

    @And("I select the fourth available flight")
    public void iSelectTheFourthAvailableFlight() {
        flightSelectionPage = new FlightSelectionPage(driver);
        flightSelectionPage.selectFourthFlight();
        log.info("Selected the fourth available flight");
    }

    @And("I fill in passenger details and proceed until payment")
    public void iFillInPassengerDetailsAndProceedUntilPayment() {
        passengerDetailsPage = new PassengerDetailsPage(driver);
        passengerDetailsPage.enterPassengerDetails("John Doe"); // Replace with actual details
        passengerDetailsPage.proceedToPayment();
        log.info("Filled in passenger details and proceeded to payment");
    }

    @Then("I should be on the payment page")
    public void iShouldBeOnThePaymentPage() {
        // Add assertion to check if the user is on the payment page
        log.info("Navigated to the payment page");
    }
}