@FunctionalTest
Feature: Orange HRM Application functionality test feature
Background: user shound be loggedin
Given browser open
When open url
Then user enters username and password
Then user clicks on login button
Then user is logged in


@addEmp_Scenario
Scenario Outline: add employee scenario
Then user clicks on PIM
Then user clicks on add employee
Then enter all details "<firstname>" and "<lastname>"
Then user attach photograpth
Then user click on save button
Then new employee registered successfully "<exp>"
Then user closes the browser
Examples:
| firstname | lastname | exp   |
| M         | Ganesh   |  M    |
| Ganesh    | Mogili   | Ganesh|


@deleteEmp_Scenario
Scenario: delete an employee from the employee list
Then user clicks on PIM
Then user clicks on employee list
Then user enters employee info empname and id
Then user clicks on search button
Then user selects the employee and clicks on delete button
