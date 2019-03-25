package webElements;


import factory.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import util.CustomWebElement;

public class RegisterAndLoginElement {
    //@Test1
    public static By ByRegisterButton = new By.ByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
    public static By ByUserFirstName = new By.ByName("firstName");
    public static By ByUserLastName = new By.ByName("lastName");
    public static By ByUserPhone = new By.ByName("phone");
    public static By ByUserEmail = new By.ById("userName");
    public static By ByUserAddress = new By.ByName("address1");
    public static By ByUserCity = new By.ByName("city");
    public static By ByUserState = new By.ByName("state");
    public static By ByUserPostalCode = new By.ByName("postalCode");
    public static By ByUserCountry = new By.ByName("country");
    public static By ByUserName = new By.ByName("email");
    public static By ByPassword = new By.ByName("password");
    public static By ByConfirmPassword = new By.ByName("confirmPassword");
    public static By BySubmitButton = new By.ByName("register");


    public static CustomWebElement RegisterButton = new CustomWebElement(ByRegisterButton);
    public static CustomWebElement UserFirstName = new CustomWebElement(ByUserFirstName);
    public static CustomWebElement UserLastName = new CustomWebElement(ByUserLastName);
    public static CustomWebElement UserPhone = new CustomWebElement(ByUserPhone);
    public static CustomWebElement UserEmail = new CustomWebElement(ByUserEmail);
    public static CustomWebElement UserAddress = new CustomWebElement(ByUserAddress);
    public static CustomWebElement UserCity = new CustomWebElement(ByUserCity);
    public static CustomWebElement UserState  = new CustomWebElement(ByUserState);
    public static CustomWebElement UserPostalCode  = new CustomWebElement(ByUserPostalCode);
    public static CustomWebElement UserName  = new CustomWebElement(ByUserName);
    public static CustomWebElement Password  = new CustomWebElement(ByPassword);
    public static CustomWebElement ConfirmPassword  = new CustomWebElement(ByConfirmPassword);
    public static CustomWebElement SubmitButton  = new CustomWebElement(BySubmitButton);

    //Test2

    public static By BySignOnLink = new By.ByLinkText("SIGN-ON");
    public static By ByUserNameTextField =new By.ByName("userName");
    public static By ByUserPasswordField = new By.ByName("password");
    public static By BySubmitButtonField = new By.ByName("login");
    public static By ByFlightDetails = new By.ByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font");
    public static By BySignOff = new By.ByLinkText("SIGN-OFF");

    public static CustomWebElement SignOffLink = new CustomWebElement(BySignOnLink);
    public static CustomWebElement UserNameTextField = new CustomWebElement(ByUserNameTextField);
    public static CustomWebElement PasswordField = new CustomWebElement(ByUserPasswordField);
    public static CustomWebElement SubmitButtonField  = new CustomWebElement(BySubmitButtonField);
    public static CustomWebElement FlightDetails = new CustomWebElement(ByFlightDetails);
    public static CustomWebElement SignOff = new CustomWebElement(BySignOff);



    //Test4
    public static By BySignOn = new By.ByLinkText("SIGN-ON");
    public static By ByRegister  = new By.ByLinkText("REGISTER");
    public static By BySupport = new By.ByLinkText("SUPPORT");
    public static By ByContact = new By.ByLinkText("CONTACT");
    public static CustomWebElement SignOn = new CustomWebElement(BySignOn);
    public static CustomWebElement Register = new CustomWebElement(ByRegister);
    public static CustomWebElement Support  = new CustomWebElement(BySupport);
    public static CustomWebElement Contact = new CustomWebElement(ByContact);

}

