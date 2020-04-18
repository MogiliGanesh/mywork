Feature: O_hrm logIn
Scenario Outline: O_hrm logIn scenario
Given browser open
When open url
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is logged in
Then Close the browser
Examples:
	| username | password | 
	| admin    | admin    | 
	| ganesh  | test@123 |