Feature: HomePageList
  @Test5
  Scenario: Validate the HomePageList and put the mouse in the center of each element of it
    Given user is on home page
    When user validate the homepageList
      | Home | Flights | Hotels | Car Rentals | Cruises | Destinations | Vacations |
    Then user put the mouse in center of each element