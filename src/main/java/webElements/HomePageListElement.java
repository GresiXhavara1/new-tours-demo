package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.CustomWebElement;

public class HomePageListElement {

    public static By ByHome =  new By.ByLinkText("Home");
    public static By ByFlights = new By.ByLinkText("Flights");
    public static By ByHotels = new By.ByLinkText("Hotels");
    public static By ByCarRentals = new By.ByLinkText("Car Rentals");
    public static By ByCruises = new By.ByLinkText("Cruises");
    public static By ByDestinations = new By.ByLinkText("Destinations");
    public static By ByVacations = new By.ByLinkText("Vacations");



    public static CustomWebElement Home = new CustomWebElement(ByHome);
    public static CustomWebElement Flights = new CustomWebElement(ByFlights);
    public static CustomWebElement Hotels = new CustomWebElement(ByHotels);
    public static CustomWebElement CarRentals = new CustomWebElement(ByCarRentals);
    public static CustomWebElement Cruises = new CustomWebElement(ByCruises);
    public static CustomWebElement Destinations = new CustomWebElement(ByDestinations);
    public static CustomWebElement Vacations  = new CustomWebElement(ByVacations);


}
