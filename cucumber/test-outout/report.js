$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Feature/featureFile.feature");
formatter.feature({
  "name": "Orange HRM Application functionality test feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.background({
  "name": "user shound be loggedin",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "browser open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.browser_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open url",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.open_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "candidates search scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@candidates_search_Scenario"
    }
  ]
});
formatter.step({
  "name": "user should be logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on recruitment link text",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_clicks_on_recruitment_link_text()"
});
