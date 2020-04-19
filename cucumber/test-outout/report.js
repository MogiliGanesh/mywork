$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Feature/addEmp.feature");
formatter.feature({
  "name": "add employee feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify user able to add new employee",
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
  "name": "user clicks on PIM",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on add employee",
  "keyword": "Then "
});
formatter.step({
  "name": "enter all details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user attach photograpth",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on save button",
  "keyword": "Then "
});
formatter.step({
  "name": "new employee registered successfully \"\u003cexp\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user closes the browser",
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
        "password",
        "firstname",
        "lastname",
        "exp"
      ]
    },
    {
      "cells": [
        "admin",
        "admin",
        "ganesh",
        "M",
        "ganesh"
      ]
    },
    {
      "cells": [
        "admin",
        "admin",
        "mogili",
        "g",
        "ganesh"
      ]
    },
    {
      "cells": [
        "ganesh",
        "test@123",
        "new",
        "employee",
        "new"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify user able to add new employee",
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
  "name": "user clicks on PIM",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_PIM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add employee",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_add_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter all details \"ganesh\" and \"M\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.enter_all_details_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user attach photograpth",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_attach_photograpth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new employee registered successfully \"ganesh\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.new_employee_registered_successfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify user able to add new employee",
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
  "name": "user clicks on PIM",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_PIM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add employee",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_add_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter all details \"mogili\" and \"g\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.enter_all_details_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user attach photograpth",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_attach_photograpth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new employee registered successfully \"ganesh\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.new_employee_registered_successfully(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.LoginStepDefinition.new_employee_registered_successfully(LoginStepDefinition.java:98)\r\n\tat ✽.new employee registered successfully \"ganesh\"(file:///C:/Users/Madhavi%20K/git/mywork/cucumber/./src/main/java/Feature/addEmp.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "verify user able to add new employee",
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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.LoginStepDefinition.user_is_logged_in(LoginStepDefinition.java:62)\r\n\tat ✽.user is logged in(file:///C:/Users/Madhavi%20K/git/mywork/cucumber/./src/main/java/Feature/addEmp.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on PIM",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_PIM()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on add employee",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_add_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter all details \"new\" and \"employee\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.enter_all_details_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user attach photograpth",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_attach_photograpth()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "new employee registered successfully \"new\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.new_employee_registered_successfully(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});