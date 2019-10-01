Feature: Log in into application

Scenario Outline: Positive test validating login
Given Initialize the chrome browser
Given open the home page "http://www.qaclickacademy.com/"
Given click on sign in link
When user enters <username> and <password> and click log in
Then verify successful log in
And Close all browsers

Examples:
|username|password|
|test99@gmail.com|123456|
|test123@gmail.com|12345|