$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Feature/login.feature");
formatter.feature({
  "name": "O_hrm logIn",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "O_hrm logIn scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser open",
  "keyword": "Given "
});
formatter.step({
  "name": "open url",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user is logged in",
  "keyword": "Then "
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    },
    {
      "cells": [
        "ganesh",
        "test@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "O_hrm logIn scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.browser_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open url",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.open_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "O_hrm logIn scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.browser_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open url",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.open_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"ganesh\" and \"test@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_logged_in()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.LoginStepDefinition.user_is_logged_in(LoginStepDefinition.java:62)\r\n\tat ✽.user is logged in(file:///C:/Users/Madhavi%20K/eclipse-workspace/cucumber/./src/main/java/Feature/login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});