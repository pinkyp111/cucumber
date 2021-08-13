Feature: login to FB
Scenario: Login to the Facebook application with invalid credentials
Given Open FB URL
When User enter invalid credentials
And Click on Login button
And Application should display the validation Message 
And Clear the data then Enter valid credentials
And Click on Login button
Then Verify the user has loggedin successfully
