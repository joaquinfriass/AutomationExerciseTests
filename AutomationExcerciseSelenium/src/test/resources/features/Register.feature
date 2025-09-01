#TC1, TC5, TC14, TC15

Feature: Login funcionality

Scenario: Register User
    Given I navigate to www.automationexercise.com
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    Then Verify New User Signup! is visible
    And Enter name "Joaquin" and email address "Joaquin@test2.com"
    Then Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    Then Fill details: Title "Mr", Password "123456", Date of birth "7" "2" "1998"
    And Select checkbox Sign up for our newsletter
    Then Select checkbox Receive special offers from our partners
    And Fill details: First name "Joaquin", Last name "Frias", Company "SoftFSA", Address "Junin", Address2 "Pampanos", Country "Canada", State "Formosa", City "Formosa Capital", Zipcode "3600", Mobile Number "3704645645"
    Then Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    Then Click Continue button
    And Verify that Logged in as username is visible
    When Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button
    