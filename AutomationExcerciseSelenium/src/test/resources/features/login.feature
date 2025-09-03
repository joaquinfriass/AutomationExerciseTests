# TC2, TC3, TC16

@login
Feature: Login Functionality

    Scenario: Test Case 2: Login User with correct email and password
        Given I navigate to www.automationexercise.com
        When I click on Signup Login button
        Then I should see Login to your account text
        When I enter correct email "admintest@gmail.com" and password "adminpass"
        And I click on login button
        Then I should see Logged in as username text
        When I click on Logout button
        Then I should be navigated to login page