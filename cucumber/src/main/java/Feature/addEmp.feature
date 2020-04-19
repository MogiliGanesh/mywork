Feature: add employee feature
Scenario Outline:  verify user able to add new employee 
Given browser open
When open url
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is logged in
Then user clicks on PIM
Then user clicks on add employee
Then enter all details "<firstname>" and "<lastname>"
Then user attach photograpth
Then user click on save button
Then new employee registered successfully "<exp>"
Then user closes the browser
Examples:
	| username | password |  firstname | lastname | exp    |
	| admin    | admin    | ganesh     | M        | ganesh |
	| admin    | admin    | mogili     | g        | ganesh |
	| ganesh   | test@123 |new         |employee  | new    |