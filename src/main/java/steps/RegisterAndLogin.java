package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import webElements.RegisterAndLoginElement;
import org.junit.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterAndLogin {

    @Given("^user is on home page$")
    public void user_is_on_home_page() {
        if (System.getProperty("BROWSER").equals("INTERNET_EXPLORER")) {
        } else if (System.getProperty("BROWSER").equals("FIREFOX")) {
            firefoxLogin();
        } else if (System.getProperty("BROWSER").equals("CHROME")) {
            chromeLogin();
        }

    }

    @When("user clicks register button at navigation bar")
    public void userClicksRegisterButtonAtNavigationBar() {
        RegisterAndLoginElement.RegisterButton.waitForElement();
        RegisterAndLoginElement.RegisterButton.click();

    }
    @And("^user fills form$")
    public void userFillsForm(DataTable dt) {
        RegisterAndLoginElement.UserFirstName.waitForElement();
        RegisterAndLoginElement.UserFirstName.sendKeys(dt.raw().get(0).get(0));
        RegisterAndLoginElement.UserLastName.waitForElement();
        RegisterAndLoginElement.UserLastName.sendKeys(dt.raw().get(0).get(1));
        RegisterAndLoginElement.UserPhone.waitForElement();
        RegisterAndLoginElement.UserPhone.sendKeys(dt.raw().get(0).get(2));
        RegisterAndLoginElement.UserEmail.waitForElement();
        RegisterAndLoginElement.UserEmail.sendKeys(dt.raw().get(0).get(3));
        RegisterAndLoginElement.UserAddress.waitForElement();
        RegisterAndLoginElement.UserAddress.sendKeys(dt.raw().get(0).get(4));
        RegisterAndLoginElement.UserCity.waitForElement();
        RegisterAndLoginElement.UserCity.sendKeys(dt.raw().get(0).get(5));
        RegisterAndLoginElement.UserState.waitForElement();
        RegisterAndLoginElement.UserState.sendKeys(dt.raw().get(0).get(6));
        RegisterAndLoginElement.UserPostalCode.waitForElement();
        RegisterAndLoginElement.UserPostalCode.sendKeys(dt.raw().get(0).get(7));
        Select userCountry = new Select(WebDriverFactory.getInstance().getDriver().findElement(RegisterAndLoginElement.ByUserCountry));
        userCountry.selectByIndex(0);
        RegisterAndLoginElement.UserName.waitForElement();
        RegisterAndLoginElement.UserName.sendKeys(dt.raw().get(0).get(9));
        RegisterAndLoginElement.Password.waitForElement();
        RegisterAndLoginElement.Password.sendKeys(dt.raw().get(0).get(10));
        RegisterAndLoginElement.ConfirmPassword.waitForElement();
        RegisterAndLoginElement.ConfirmPassword.sendKeys(dt.raw().get(0).get(11));
    }

    @Then("user clicks submit button")
    public void userClicksSubmitButton() {
        RegisterAndLoginElement.SubmitButton.waitForElement();
        RegisterAndLoginElement.SubmitButton.click();


    }
    //Step2

    @When("^user clicks sign-on button on navigation bar$")
    public void userClicksSignOnButtonOnNavigationBar() {
        RegisterAndLoginElement.SignOn.waitForElement();
        RegisterAndLoginElement.SignOn.click();
    }

    @And("^user enters user name and password$")
    public void userEntersUsernameAndPassword(DataTable dt) {
        RegisterAndLoginElement.UserNameTextField.waitForElement();
        RegisterAndLoginElement.UserNameTextField.sendKeys(dt.raw().get(0).get(0));
        RegisterAndLoginElement.PasswordField.waitForElement();
        RegisterAndLoginElement.PasswordField.sendKeys(dt.raw().get(0).get(1));
    }


    @And("^user clicks submit$")
    public void userClicksSubmit() {
        RegisterAndLoginElement.SubmitButtonField.waitForElement();
        RegisterAndLoginElement.SubmitButtonField.click();
    }

    @Then("^user check for \"([^\"]*)\"$")
    public void userCheckFor(String title) {
        String expected = RegisterAndLoginElement.FlightDetails.getText();
        System.out.println("Text is" + expected);
        Assert.assertEquals(title,expected);
    }
    @And("^user clicks Sign-Off button$")
    public void userClicksSignOffButton() {
        RegisterAndLoginElement.SignOff.waitForElement();
        RegisterAndLoginElement.SignOff.click();
    }


    //Step3
    @When("^user check \"([^\"]*)\" link$")
    public void userCheckLink(String SignOnLink){
        Assert.assertEquals(SignOnLink,RegisterAndLoginElement.SignOffLink.getText());
    }

    //Step4
    @Given("^the navigation bar headers are$")
    public void theNavigationBarHeadersAre(DataTable dt) {
        Assert.assertEquals(dt.raw().get(0).get(0), RegisterAndLoginElement.SignOn.getText());
        Assert.assertEquals(dt.raw().get(0).get(1), RegisterAndLoginElement.Register.getText());
        Assert.assertEquals(dt.raw().get(0).get(2),RegisterAndLoginElement.Support.getText());
        Assert.assertEquals(dt.raw().get(0).get(3),RegisterAndLoginElement.Contact.getText());
    }


    public void firefoxLogin() {
        WebDriver driver = WebDriverFactory.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(System.getProperty("IMPLICITLY_WAIT")), TimeUnit.MILLISECONDS);
        driver.navigate().to(System.getProperty("URL"));
    }

    public void chromeLogin() {
        WebDriver driver = WebDriverFactory.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(System.getProperty("IMPLICITLY_WAIT")), TimeUnit.MILLISECONDS);
        driver.navigate().to(System.getProperty("URL"));

    }
}