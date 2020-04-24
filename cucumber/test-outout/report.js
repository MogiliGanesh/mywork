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
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on candidates link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_clicks_on_candidates_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects recruitment info",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_selects_recruitment_info()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d81.0.4044.113)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027GANESH\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.113, chrome: {chromedriverVersion: 81.0.4044.69 (6813546031a4b..., userDataDir: C:\\Users\\MADHAV~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59540}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5b4649b9492a17a648e714df329235e9\n*** Element info: {Using\u003dtag name, value\u003doption}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.findElements(RemoteWebElement.java:204)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.findElementsByTagName(RemoteWebElement.java:281)\r\n\tat org.openqa.selenium.By$ByTagName.findElements(By.java:312)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.findElements(RemoteWebElement.java:177)\r\n\tat org.openqa.selenium.support.ui.Select.getOptions(Select.java:72)\r\n\tat org.openqa.selenium.support.ui.Select.getAllSelectedOptions(Select.java:80)\r\n\tat stepDefinition.StepDefinition.user_selects_recruitment_info(StepDefinition.java:222)\r\n\tat ✽.user selects recruitment info(file:///C:/Users/Madhavi%20K/git/mywork/cucumber/./src/main/java/Feature/featureFile.feature:39)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on candidate search button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.user_clicks_on_candidate_search_button()"
});
formatter.result({
  "status": "skipped"
});
});