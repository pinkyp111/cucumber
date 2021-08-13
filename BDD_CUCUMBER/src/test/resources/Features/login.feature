Feature: login to FB
Scenario: Login to the Facebook application with invalid credentials
Given Open FB URL
When User enter invalid credentials
And Click on Login button
Then Application should display the validation Message