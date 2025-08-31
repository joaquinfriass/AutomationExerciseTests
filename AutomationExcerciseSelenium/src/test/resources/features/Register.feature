#TC1, TC5, TC14, TC15

Feature: Login funcionality

Scenario: Register User
    Given I navigate to www.automationexercise.com
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    Then Verify New User Signup! is visible
    And Enter name "Joaquin" and email address "Joaquin@test.com"
    Then Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    Then Fill details: Title "Mr", Password "123456", Date of birth "7" "2" "1998"
    ##Retomar los siguientes pasos más tarde
    