package webElements;

import org.openqa.selenium.By;
import util.CustomWebElement;

public class FlightBookingElement {
    //@Test6
    public static By ByFlightType = new By.ByXPath("//*[@value=\"oneway\"]");
    public static By ByPassengers = new By.ByName("passCount");
    public static By ByDepartingFrom = new By.ByName("fromPort");
    public static By ByOn = new By.ByName("fromMonth");
    public static By ByDay = new By.ByName("fromDay");
    public static By ByArrivingOn = new By.ByName("toPort");
    public static By ByArrivingMonth = new By.ByName("toMonth");
    public static By ByArrivingDate = new By.ByName("toDay");
    public static By ByServiceClass = new By.ByXPath("//*[@value=\"Business\"]");
    public static By ByAirline = new By.ByCssSelector("select[name=\"airline\"]");
    public static By ByContinueButton = new By.ByName("findFlights");
    public static By ByDeparture = new By.ByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input");
    public static By ByReturn = new By.ByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input");
    public static By ByContinue = new By.ByName("reserveFlights");
    public static By ByFirstNamePassengers = new By.ByName("passFirst0");
    public static By ByLastNamePassengers = new By.ByName("passLast0");
    public static By ByMeal = new By.ByName("pass.0.meal");
    public static By ByCardType = new By.ByName("creditCard");
    public static By ByNumber  = new By.ByName("creditnumber");
    public static By ByExpirationMonth = new By.ByName("cc_exp_dt_mn");
    public static By ByExpirationDay = new By.ByName("cc_exp_dt_yr");
    public static By ByMiddleNamePassangers = new By.ByName("cc_mid_name");
    public static By ByFirstName = new By.ByName("cc_frst_name");
    public static By ByLastName = new By.ByName("cc_last_name");
    public static By ByAddress = new By.ByName("billAddress1");
    public static By ByCity = new By.ByName("delCity");
    public static By ByState = new By.ByName("delState");
    public static By ByPostalCode = new By.ByName("delZip");
    public static By ByCountry = new By.ByName("delCountry");


    public static CustomWebElement FlightType = new CustomWebElement(ByFlightType);
    public static CustomWebElement ServiceClass = new CustomWebElement(ByServiceClass);
    public static CustomWebElement ContinueButton = new CustomWebElement(ByContinueButton);
    public static CustomWebElement Departure = new CustomWebElement(ByDeparture);
    public static CustomWebElement Return = new CustomWebElement(ByReturn);
    public static CustomWebElement Continue = new CustomWebElement(ByContinue);
    public static CustomWebElement FirstNamePassengers = new CustomWebElement(ByFirstNamePassengers);
    public static CustomWebElement LastNamePassengers = new CustomWebElement(ByLastNamePassengers);
    public static CustomWebElement Number = new CustomWebElement(ByNumber);
    public static CustomWebElement MiddleNamePassangers = new CustomWebElement(ByMiddleNamePassangers);
    public static CustomWebElement FirstName = new CustomWebElement(ByFirstName);
    public static CustomWebElement LastName = new CustomWebElement(ByLastName);
    public static CustomWebElement Address = new CustomWebElement(ByAddress);
    public static CustomWebElement City = new CustomWebElement(ByCity);
    public static CustomWebElement State = new CustomWebElement(ByState);
    public static CustomWebElement PostalCode = new CustomWebElement(ByPostalCode);

}
