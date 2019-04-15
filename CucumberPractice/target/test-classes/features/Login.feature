Feature: Login 
In order to login to QAClickAcademy
As a registered user
I want to navigate to Login Page and enter valid credentials

Scenario: Login to QAClickAcademy with Valid Credentials
Given Registered user navigated to login page
When Registered user enters "jpagar03@gmail.com" and "pimpin11" and click log in
Then Registered user logged in successfully
Then Close the browser





Scenario Outline: Login to QAClickAcademy with Invalid Credentials
Given Registered user navigated to login page
When Registered user enters <email> and <password> and clicks login
Then Registered user receives login error message
Then Close the browser

Examples:
|email           |password|
|jpag02@gmail.com|12345   |
|jpag03@gmail.com|56789   |
|jpag04@gmail.com|13456   |


