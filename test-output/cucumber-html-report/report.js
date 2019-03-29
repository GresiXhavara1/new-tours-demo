$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FlightBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Book a Flight",
  "description": "",
  "id": "book-a-flight",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "A user logged in and book a flight",
  "description": "",
  "id": "book-a-flight;a-user-logged-in-and-book-a-flight",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test6"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks sign-on button on navigation bar",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "gresi",
        "gresi"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "fills the Flight Details and Preferences",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user select departure Flight",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user select Return Flight",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks continue",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "fills Passenger Form",
  "rows": [
    {
      "cells": [
        "sara",
        "hshssh"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Credit Card Form",
  "rows": [
    {
      "cells": [
        "737376363633",
        "sara",
        "dhdhdhd",
        "hshssh"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Billing Address Form",
  "rows": [
    {
      "cells": [
        "tirana",
        "",
        "tirana",
        "Albania",
        "10001"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Delivery Address",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "clicks Secure Purchase",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the itinerary is booked",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "we clicks Log Out button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 1506049226,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSignOnButtonOnNavigationBar()"
});
formatter.result({
  "duration": 643316929,
  "status": "passed"
});
formatter.match({
  "location": "FlightBooking.UserEntersUsernameAndPassword(DataTable)"
});
formatter.result({
  "duration": 74524254296,
  "status": "passed"
});
formatter.match({
  "location": "FlightBooking.fillsTheFlightDetailsAndPreferences()"
});
formatter.result({
  "duration": 16403875039,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@value\u003d\"oneway\"] (tried for 15 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat util.CustomWebElement.waitForElement(CustomWebElement.java:143)\r\n\tat steps.FlightBooking.fillsTheFlightDetailsAndPreferences(FlightBooking.java:26)\r\n\tat ✽.And fills the Flight Details and Preferences(FlightBooking.feature:9)\r\nCaused by: org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d73.0.3683.75)\n  (Driver info: chromedriver\u003d73.0.3683.68 (47787ec04b6e38e22703e856e101e840b65afe72),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027LHIND-N210611\u0027, ip: \u0027192.168.51.38\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 73.0.3683.68 (47787ec04b6e3..., userDataDir: C:\\Users\\U173499\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:50380}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.75, webStorageEnabled: true}\nSession ID: c8e12eec2bad9e70770c408385aa007c\n*** Element info: {Using\u003dxpath, value\u003d//*[@value\u003d\"oneway\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:349)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:310)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat util.CustomWebElement.waitForElement(CustomWebElement.java:143)\r\n\tat steps.FlightBooking.fillsTheFlightDetailsAndPreferences(FlightBooking.java:26)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:122)\r\n\tat cucumber.api.cli.Main.run(Main.java:36)\r\n\tat factory.MainCucumber.main(MainCucumber.java:39)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FlightBooking.userClicksContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.userSelectDepartureFlight()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.userSelectReturnFlight()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.userClicksContinue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.fillsPassengerForm(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.creditCardForm(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.billingAddressForm(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.deliveryAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.clicksSecurePurchase()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.theIteneraryIsBooked()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlightBooking.weClicksLogOutButton()"
});
formatter.result({
  "status": "skipped"
});
});