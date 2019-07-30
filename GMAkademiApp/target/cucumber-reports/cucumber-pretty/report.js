$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Successful Login Section",
  "description": "",
  "id": "successful-login-section",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login the app successfully as a GM User",
  "description": "",
  "id": "successful-login-section;login-the-app-successfully-as-a-gm-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the user selection screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click General Mobile Kullanicisiyim text",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I fill Email field with \"\u003cemail\u003e\" and Password field with \"\u003cpassword\u003e\" and click Sign in on Login Screen",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see \"\u003cemail\u003e\" on my profile screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "successful-login-section;login-the-app-successfully-as-a-gm-user;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 10,
      "id": "successful-login-section;login-the-app-successfully-as-a-gm-user;;1"
    },
    {
      "cells": [
        "ozdemirseda59@gmail.com",
        "12345TesT!"
      ],
      "line": 11,
      "id": "successful-login-section;login-the-app-successfully-as-a-gm-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 118560,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login the app successfully as a GM User",
  "description": "",
  "id": "successful-login-section;login-the-app-successfully-as-a-gm-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the user selection screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click General Mobile Kullanicisiyim text",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I fill Email field with \"ozdemirseda59@gmail.com\" and Password field with \"12345TesT!\" and click Sign in on Login Screen",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see \"ozdemirseda59@gmail.com\" on my profile screen",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnTheUserSelectionScreen()"
});
formatter.result({
  "duration": 1644364,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickGeneralMobileKullanicisiyimText()"
});
formatter.result({
  "duration": 2573337296,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ozdemirseda59@gmail.com",
      "offset": 25
    },
    {
      "val": "12345TesT!",
      "offset": 75
    }
  ],
  "location": "LoginSteps.iFillEmailFieldWithAndPasswordFieldWithAndClickSignInOnLoginScreen(String,String)"
});
formatter.result({
  "duration": 15019932859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ozdemirseda59@gmail.com",
      "offset": 14
    }
  ],
  "location": "LoginSteps.iShouldSeeOnMyProfileScreen(String)"
});
formatter.result({
  "duration": 3179812199,
  "status": "passed"
});
formatter.after({
  "duration": 1408549407,
  "status": "passed"
});
formatter.uri("Logout.feature");
formatter.feature({
  "line": 2,
  "name": "Successful Logout Section",
  "description": "",
  "id": "successful-logout-section",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Logout"
    }
  ]
});
formatter.before({
  "duration": 140837,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the user selection screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click General Mobile Kullanicisiyim text",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I fill Email field with \"ozdemirseda59@gmail.com\" and Password field with \"12345TesT!\" and click Sign in on Login Screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnTheUserSelectionScreen()"
});
formatter.result({
  "duration": 30207,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickGeneralMobileKullanicisiyimText()"
});
formatter.result({
  "duration": 2691813033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ozdemirseda59@gmail.com",
      "offset": 25
    },
    {
      "val": "12345TesT!",
      "offset": 75
    }
  ],
  "location": "LoginSteps.iFillEmailFieldWithAndPasswordFieldWithAndClickSignInOnLoginScreen(String,String)"
});
formatter.result({
  "duration": 15842565116,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Logout the app successfully as a GM User",
  "description": "",
  "id": "successful-logout-section;logout-the-app-successfully-as-a-gm-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I click Menu on Main Screen",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click Cıkıs Yap button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should see User Selection Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LogoutSteps.iClickMenuOnMainScreen()"
});
formatter.result({
  "duration": 2062468826,
  "status": "passed"
});
formatter.match({
  "location": "LogoutSteps.iClickCıkısYapButton()"
});
formatter.result({
  "duration": 1706526972,
  "status": "passed"
});
formatter.match({
  "location": "LogoutSteps.iShouldSeeUserSelectionScreen()"
});
formatter.result({
  "duration": 671441426,
  "status": "passed"
});
formatter.after({
  "duration": 1226474745,
  "status": "passed"
});
}););