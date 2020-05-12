*** Settings ***

Library    SeleniumLibrary 
 
*** Test Cases ***
LogOut_OrangeHRM
  [ Documentation ]   OrangeHRM LogOut functionality
     [tags]           LogOut
    LogInKW
    Click Element    id=welcome    
    Log    Welcome Clicked    
    Click Link    link=Logout    
    Close Browser
    Log    Browser closed 
    Log    Test Complete
    

PIM Add Employee
    [tags]                      LogIn
    [ Documentation ]   OrangeHRM Add Employee functionality 
     LogInKW
     Mouse Over    id=menu_pim_viewPimModule
     Click Element    link=Add Employee
     Input Text    id=firstName    &{LogIn data}[FirstName]    
     Input Text    id=lastName    &{LogIn data}[lastName]
     Click Button    id=btnSave  
     sleep     5
    ${Emp id}       Get Element Attribute    id=personal_txtEmployeeId    value      
        Log Variables   empid=${Emp id}=empid
    
*** Variables ***
${URL}    http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login
@{credentials}    admin    admin    
&{LogIn data}    UserName=admin    Password=admin    FirstName=Ganesh    lastName=M

*** Keywords ***
LogInKW
     [ Documentation ]   OrangeHRM LogIn functionality
    
    Log                         Test Started    
    Create Webdriver    Chrome    executable_path=E:\\chromedriver.exe 
    Log    Browser opened      
    Go To         ${URL}         
    Log    Url Entered
    Set Browser Implicit Wait    5
    Maximize Browser Window
    Delete All Cookies
    Input Text          name=txtUsername    @{credentials}[0]
    Log    UserName Entered
    Input Text          name=txtPassword    &{LogIn data}[Password]
    Log    Password Entered
    Click Button        name=Submit
    Log    LogInButton Clicked    
    Sleep               5    
    