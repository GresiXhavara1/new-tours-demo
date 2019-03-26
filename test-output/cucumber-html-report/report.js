$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePageList.feature");
formatter.feature({
  "line": 1,
  "name": "HomePageList",
  "description": "",
  "id": "homepagelist",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate the HomePageList and put the mouse in the center of each element of it",
  "description": "",
  "id": "homepagelist;validate-the-homepagelist-and-put-the-mouse-in-the-center-of-each-element-of-it",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test5"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user validate the homepageList",
  "rows": [
    {
      "cells": [
        "Home",
        "Flights",
        "Hotels",
        "Car Rentals",
        "Cruises",
        "Destinations",
        "Vacations"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user put the mouse in center of each element",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 2178042059,
  "status": "passed"
});
formatter.match({
  "location": "HomePageList.user_validate_the_homepageList(DataTable)"
});
formatter.result({
  "duration": 279981091,
  "status": "passed"
});
formatter.match({
  "location": "HomePageList.userPutTheMouseInCenterOfEachElement()"
});
formatter.result({
  "duration": 38131561,
  "status": "passed"
});
});