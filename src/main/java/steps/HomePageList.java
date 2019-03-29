package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import webElements.HomePageListElement;

public class HomePageList {
    @When("^user validate the homepageList$")
    public void user_validate_the_homepageList(DataTable dt){
        Assert.assertEquals(dt.raw().get(0).get(0),HomePageListElement.Home.getText());
        Assert.assertEquals(dt.raw().get(0).get(1),HomePageListElement.Flights.getText());
        Assert.assertEquals(dt.raw().get(0).get(2),HomePageListElement.Hotels.getText());
        Assert.assertEquals(dt.raw().get(0).get(3),HomePageListElement.CarRentals.getText());
        Assert.assertEquals(dt.raw().get(0).get(4),HomePageListElement.Cruises.getText());
        Assert.assertEquals(dt.raw().get(0).get(5),HomePageListElement.Destinations.getText());
        Assert.assertEquals(dt.raw().get(0).get(6),HomePageListElement.Vacations.getText());

    }

<<<<<<< HEAD
//    @Then("^user put the mouse in center of each element$")
//    public void userPutTheMouseInCenterOfEachElement() {
//        Actions builder = new Actions(WebDriverFactory.getInstance().getDriver());
//        Action mouseOverHome = builder.moveToElement(WebDriverFactory.getInstance().getDriver().findElement(HomePageListElement.ByHome)).build();
//        mouseOverHome.perform();
=======
   @Then("^user put the mouse in center of each element$")
   public void userPutTheMouseInCenterOfEachElement() {
       Actions builder = new Actions(WebDriverFactory.getInstance().getDriver());
        Action mouseOverHome = builder.moveToElement(WebDriverFactory.getInstance().getDriver().findElement(HomePageListElement.ByHome)).build();
        mouseOverHome.perform();
>>>>>>> master

    }
}
git 