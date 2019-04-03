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
  "line": 5,
  "name": "User creates an account to register in new tours page",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks register button at navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fills form",
  "rows": [
    {
      "cells": [
        "\u003cfirstname\u003e",
        "\u003clastname\u003e",
        "\u003cphone\u003e",
        "\u003cemail\u003e",
        "\u003caddress\u003e",
        "\u003ccity\u003e",
        "\u003cstate\u003e",
        "\u003cpostal code\u003e",
        "\u003ccountry\u003e",
        "\u003cusername\u003e",
        "\u003cpassword\u003e",
        "\u003cconfirm password\u003e"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "phone",
        "email",
        "address",
        "city",
        "state",
        "postal code",
        "country",
        "username",
        "password",
        "confirm password"
      ],
      "line": 12,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;;1"
    },
    {
      "cells": [
        "gresi",
        "xhavara",
        "987655445434",
        "geet.31@hotmail.com",
        "Bardhok Biba",
        "Tirana",
        "Albania",
        "1000",
        "Albania",
        "gresi",
        "gresi",
        "gresi"
      ],
      "line": 13,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;;2"
    },
    {
      "cells": [
        "dhdhdhd",
        "dhdhdhd",
        "565674864778",
        "getet@1@hotmaIL.com",
        "fhfdjfsfsd",
        "Tirana",
        "Albania",
        "1000",
        "Albania",
        "marjo",
        "marjo",
        "marjo"
      ],
      "line": 14,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;;3"
    },
    {
      "cells": [
        "kejsi",
        "kosta",
        "435344534",
        "hdhdhdh@email.com",
        "dfggdgfdf",
        "Tirana",
        "Albania",
        "1000",
        "Albania",
        "kejsi",
        "kejsi",
        "kejsi"
      ],
      "line": 15,
      "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User creates an account to register in new tours page",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks register button at navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fills form",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "rows": [
    {
      "cells": [
        "gresi",
        "xhavara",
        "987655445434",
        "geet.31@hotmail.com",
        "Bardhok Biba",
        "Tirana",
        "Albania",
        "1000",
        "Albania",
        "gresi",
        "gresi",
        "gresi"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 3494811850,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksRegisterButtonAtNavigationBar()"
});
formatter.result({
  "duration": 792932742,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userFillsForm(DataTable)"
});
formatter.result({
  "duration": 1333822679,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSubmitButton()"
});
formatter.result({
  "duration": 74448985610,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User creates an account to register in new tours page",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks register button at navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fills form",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "rows": [
    {
      "cells": [
        "dhdhdhd",
        "dhdhdhd",
        "565674864778",
        "getet@1@hotmaIL.com",
        "fhfdjfsfsd",
        "Tirana",
        "Albania",
        "1000",
        "Albania",
        "marjo",
        "marjo",
        "marjo"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 1004051066,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksRegisterButtonAtNavigationBar()"
});
formatter.result({
  "duration": 783252323,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userFillsForm(DataTable)"
});
formatter.result({
  "duration": 1377155374,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSubmitButton()"
});
formatter.result({
  "duration": 7454159602,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User creates an account to register in new tours page",
  "description": "",
  "id": "register-and-login-of-a-user-in-new-tours-page;user-creates-an-account-to-register-in-new-tours-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    },
    {
      "line": 4,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks register button at navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fills form",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11
  ],
  "rows": [
    {
      "cells": [
        "kejsi",
        "kosta",
        "435344534",
        "hdhdhdh@email.com",
        "dfggdgfdf",
        "Tirana",
        "Albania",
        "1000",
        "Albania",
        "kejsi",
        "kejsi",
        "kejsi"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterAndLogin.user_is_on_home_page()"
});
formatter.result({
  "duration": 685440367,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksRegisterButtonAtNavigationBar()"
});
formatter.result({
  "duration": 1066388163,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userFillsForm(DataTable)"
});
formatter.result({
  "duration": 1214595843,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.userClicksSubmitButton()"
});
formatter.result({
  "duration": 21242039556,
  "status": "passed"
});
});