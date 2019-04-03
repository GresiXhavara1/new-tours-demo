@Register
Feature: Register and Login of a user in new tours page

  @Test1
  Scenario Outline: User creates an account to register in new tours page
    Given user is on home page
    When user clicks register button at navigation bar
    And  user fills form
      | <firstname> | <lastname> | <phone> | <email> | <address> | <city> | <state> | <postal code> | <country> | <username> | <password> | <confirm password> |
    Then user clicks submit button
    Examples:
      | firstname | lastname | phone        | email               | address      | city   | state   | postal code | country | username | password | confirm password |
      | gresi     | xhavara  | 987655445434   | geet.31@hotmail.com | Bardhok Biba | Tirana | Albania | 1000        | Albania | gresi    | gresi    | gresi            |
      | dhdhdhd   | dhdhdhd  | 565674864778 | getet@1@hotmaIL.com | fhfdjfsfsd   | Tirana | Albania | 1000        | Albania | marjo    | marjo    | marjo            |
      | kejsi     | kosta    | 435344534    | hdhdhdh@email.com   | dfggdgfdf    | Tirana | Albania | 1000        | Albania | kejsi    | kejsi    | kejsi            |


  @Test2
  Scenario Outline: User logs in
    Given user is on home page
    When user clicks sign-on button on navigation bar
    And user enters user name and password
      | <username> | <password> |
    And user clicks submit
    Then user check for "Flight Details"
    And user clicks Sign-Off button
    Examples:
      | username | password |
      | gresi    | gresi    |
      | marjo    | marjo    |
      | kejsi    | kejsi    |


  @Test3
  Scenario: Check for the links on navigation bar
    Given user is on home page
    When user check "SIGN-OFF" link

  @Test4
  Scenario: Check for navigation bar headers
    When user is on home page
    Given the navigation bar headers are
      | SIGN-ON | REGISTER | SUPPORT | CONTACT |






