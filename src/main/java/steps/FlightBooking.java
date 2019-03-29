package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import factory.WebDriverFactory;
import org.openqa.selenium.support.ui.Select;
import webElements.FlightBookingElement;
import webElements.RegisterAndLoginElement;

public class FlightBooking {

    @And("^user enters username and password$")
    public void UserEntersUsernameAndPassword(DataTable dt) {
        RegisterAndLoginElement.UserNameTextField.waitForElement();
        RegisterAndLoginElement.UserNameTextField.sendKeys(dt.raw().get(0).get(0));
        RegisterAndLoginElement.PasswordField.waitForElement();
        RegisterAndLoginElement.PasswordField.sendKeys(dt.raw().get(0).get(0));
        RegisterAndLoginElement.SubmitButtonField.waitForElement();
        RegisterAndLoginElement.SubmitButtonField.click();

    }

    @And("^fills the Flight Details and Preferences$")
    public void fillsTheFlightDetailsAndPreferences() throws InterruptedException {
        FlightBookingElement.FlightType.waitForElement();
        FlightBookingElement.FlightType.click();
        Thread.sleep(2000);
        Select flightPassangers = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByPassengers));
        flightPassangers.selectByIndex(1);
        Select departingFrom = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByDepartingFrom));
        departingFrom.selectByValue("Frankfurt");
        Thread.sleep(2000);
        Select On = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByOn));
        On.selectByVisibleText("April");
        Select byDay = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByDay));
        byDay.selectByValue("2");
        Select byArrivingOn = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByArrivingOn));
        byArrivingOn.selectByVisibleText("London");
        Select returningMonth = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByArrivingMonth));
        returningMonth.selectByValue("10");
        Thread.sleep(2000);
        Select returningDay = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByArrivingDate));
        returningDay.selectByValue("2");
        FlightBookingElement.ServiceClass.waitForElement();
        FlightBookingElement.ServiceClass.click();
        Select Airline = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByAirline));
        Airline.selectByVisibleText("Blue Skies Airlines");
    }

    @Then("^user clicks continue button$")
    public void userClicksContinueButton() {
        FlightBookingElement.ContinueButton.waitForElement();
        FlightBookingElement.ContinueButton.click();
    }

    @And("^user select departure Flight$")
    public void userSelectDepartureFlight() {
        FlightBookingElement.Departure.waitForElement();
        FlightBookingElement.Departure.click();
    }

    @And("^user select Return Flight$")
    public void userSelectReturnFlight() {
        FlightBookingElement.Return.waitForElement();
        FlightBookingElement.Return.click();
    }

    @And("^user clicks continue$")
    public void userClicksContinue() {
        FlightBookingElement.Continue.waitForElement();
        FlightBookingElement.Continue.click();
    }

    @And("^fills Passenger Form$")
    public void fillsPassengerForm(DataTable dt) {
        FlightBookingElement.FirstNamePassengers.waitForElement();
        FlightBookingElement.FirstNamePassengers.sendKeys(dt.raw().get(0).get(0));
        FlightBookingElement.LastNamePassengers.waitForElement();
        FlightBookingElement.LastNamePassengers.sendKeys(dt.raw().get(0).get(1));
        Select mealPassenger = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByMeal));
        mealPassenger.selectByIndex(1);
    }

    @And("^Credit Card Form$")
    public void creditCardForm(DataTable dt) throws InterruptedException {
        Thread.sleep(2000);
        Select creditcardType = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByCardType));
        creditcardType.selectByVisibleText("MasterCard");
        Thread.sleep(2000);
        FlightBookingElement.Number.waitForElement();
        FlightBookingElement.Number.sendKeys(dt.raw().get(0).get(0));
        Select expirationMonth = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByExpirationMonth));
        expirationMonth.selectByIndex(2);
        Select expirationDay = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByExpirationDay));
        expirationDay.selectByVisibleText("2010");
        Thread.sleep(2000);
        FlightBookingElement.FirstName.waitForElement();
        FlightBookingElement.FirstName.sendKeys(dt.raw().get(0).get(1));
        FlightBookingElement.MiddleNamePassangers.waitForElement();
        Thread.sleep(2000);
        FlightBookingElement.MiddleNamePassangers.sendKeys(dt.raw().get(0).get(2));
        Thread.sleep(2000);
        FlightBookingElement.LastName.waitForElement();
        FlightBookingElement.LastName.sendKeys(dt.raw().get(0).get(3));

    }

    @And("^Billing Address Form$")
    public void billingAddressForm(DataTable dt) throws InterruptedException {
        Thread.sleep(2000);
        FlightBookingElement.Address.waitForElement();
        FlightBookingElement.Address.sendKeys(dt.raw().get(0).get(0));
        Thread.sleep(2000);
        FlightBookingElement.City.waitForElement();
        FlightBookingElement.City.sendKeys(dt.raw().get(0).get(1));
        Thread.sleep(2000);
        FlightBookingElement.State.waitForElement();
        FlightBookingElement.State.sendKeys(dt.raw().get(0).get(2));
        Thread.sleep(2000);
        FlightBookingElement.PostalCode.waitForElement();
        FlightBookingElement.PostalCode.sendKeys(dt.raw().get(0).get(3));
        Thread.sleep(2000);
        Select countryBooking = new Select(WebDriverFactory.getInstance().getDriver().findElement(FlightBookingElement.ByCountry));
        countryBooking.selectByVisibleText("ALBANIA");
    }
    @Then("^Delivery Address$")
    public void deliveryAddress() {
    }

    @And("^clicks Secure Purchase$")
    public void clicksSecurePurchase() {
    }

    @Then("^the itinerary is booked$")
    public void theIteneraryIsBooked() {
    }

    @And("^we clicks Log Out button$")
    public void weClicksLogOutButton() {
    }
}
