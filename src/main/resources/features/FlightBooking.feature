Feature: Book a Flight

  @Test6
  Scenario: A user logged in and book a flight
    Given user is on home page
    And  user clicks sign-on button on navigation bar
    And  user enters username and password
      | gresi | gresi |
    And  fills the Flight Details and Preferences
    Then user clicks continue button
    And  user select departure Flight
    And  user select Return Flight
    And  user clicks continue
    And  fills Passenger Form
      | sara | hshssh |
    And  Credit Card Form
      | 737376363633 | sara | dhdhdhd | hshssh |
    And  Billing Address Form
      | tirana |  | tirana | Albania | 10001 |
    Then Delivery Address
    And  clicks Secure Purchase
    Then the itinerary is booked
    And  we clicks Log Out button

