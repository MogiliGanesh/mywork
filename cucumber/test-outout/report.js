$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Feature/addEmp.feature");
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
  "name": "delete an employee from the employee list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@deleteEmp_Scenario"
    }
  ]
});
formatter.step({
  "name": "user clicks on PIM",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_clicks_on_PIM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on employee list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_clicks_on_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters employee info empname and id",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_enters_employee_info_empname_and_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the employee and clicks on delete button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_selects_the_employee_and_clicks_on_delete_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});