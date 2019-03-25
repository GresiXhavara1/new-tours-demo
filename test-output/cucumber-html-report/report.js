$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterAndLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Register and Login of a user in new tours page",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    }
  ]
});
formatter.scenarioOutline({
  "line": 19,
  "name": "User logs in",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user clicks sign-on button on navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters user name and password",
  "rows": [
    {
      "cells": [
        "\u003cusername\u003e",
        "\u003cpassword\u003e"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user check for \"Flight Details\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks Sign-Off button",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;;1"
    },
    {
      "cells": [
        "gresi",
        "gresi"
      ],
      "line": 29,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;;2"
    },
    {
      "cells": [
        "marjo",
        "marjo"
      ],
      "line": 30,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;;3"
    },
    {
      "cells": [
        "kejsi",
        "kejsi"
      ],
      "line": 31,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "User logs in",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    },
    {
      "line": 18,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user clicks sign-on button on navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters user name and password",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "gresi",
        "gresi"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user check for \"Flight Details\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks Sign-Off button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 1715199136,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSignOnButtonOnNavigationBar()"
});
formatter.result({
  "duration": 664852895,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userEntersUsernameAndPassword(DataTable)"
});
formatter.result({
  "duration": 213662005,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSubmit()"
});
formatter.result({
  "duration": 43898905016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Details",
      "offset": 16
    }
  ],
  "location": "RegisterAndLogin.userCheckFor(String)"
});
formatter.result({
  "duration": 40631089,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSignOffButton()"
});
formatter.result({
  "duration": 1053340457,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User logs in",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    },
    {
      "line": 18,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user clicks sign-on button on navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters user name and password",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "marjo",
        "marjo"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user check for \"Flight Details\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks Sign-Off button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 647911978,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSignOnButtonOnNavigationBar()"
});
formatter.result({
  "duration": 697003519,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userEntersUsernameAndPassword(DataTable)"
});
formatter.result({
  "duration": 171408452,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSubmit()"
});
formatter.result({
  "duration": 24620083899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Details",
      "offset": 16
    }
  ],
  "location": "RegisterAndLogin.userCheckFor(String)"
});
formatter.result({
  "duration": 50990394,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSignOffButton()"
});
formatter.result({
  "duration": 891305448,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "User logs in",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-logs-in;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    },
    {
      "line": 18,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user clicks sign-on button on navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters user name and password",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "kejsi",
        "kejsi"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user check for \"Flight Details\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks Sign-Off button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 681362613,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSignOnButtonOnNavigationBar()"
});
formatter.result({
  "duration": 661512437,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userEntersUsernameAndPassword(DataTable)"
});
formatter.result({
  "duration": 223542161,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSubmit()"
});
formatter.result({
  "duration": 56861121641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flight Details",
      "offset": 16
    }
  ],
  "location": "RegisterAndLogin.userCheckFor(String)"
});
formatter.result({
  "duration": 33366434,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSignOffButton()"
});
formatter.result({
  "duration": 1136555860,
  "status": "passed"
});
});