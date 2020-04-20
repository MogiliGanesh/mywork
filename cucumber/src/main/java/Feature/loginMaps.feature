Feature: O_hrm logIn
Scenario: O_hrm logIn scenario
Given browser opens
When open url
Then user enters username and password
| username | password |
| admin    | admin    |
| admin    | admin1    |
| admin    | admin1    |
Then user clicks on login button
Then user is logged in