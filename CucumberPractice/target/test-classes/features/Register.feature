Feature: Register an Account
In order to register for an account on QAClickAcademy
As a new user
I want to Navigate to Register Page and Enter Personal Information

Scenario Outline: Register an Account on QAClickAcademy
Given New user navigated to register page
When New user enters Personal Information <fullname>, <email>, <password> and clicks sign up
#Then New user becomes a registered user
Then Close the browser

Examples:
|fullname|email        |password|
|tiffl   |123@gmail.com|pimpin11|
|jpaga   |124@gmail.com|pimpin11|