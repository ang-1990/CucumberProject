  Feature: Login functionality for opencart E-commerce application

    As a user of the OpenCart website
    I want to be able to log in with my account
    So that I can access my account-related features and manage my orders

    Background:
      Given I am on opencart login page

      Scenario: Successful login with valid credentials
        Given I have a entered a valid username and password
        When I click on login button
        Then I should be logged in successfully


        Scenario Outline: Unsuccessful login with invalid credentials
          Given I have entered invalid "<username>" and "<password>"
          When I click on login button
          Then I should see an message "<error_message>"
          Examples:
            | username | password | error_message |
            | invalid@gmail.com | invalidpwd |  Warning: No match for E-Mail Address and/or Password.|
            | svfvjn | invalid@pwd |  Warning: No match for E-Mail Address and/or Password.|
            | invalid@gl.com  | isdaf |  Warning: No match for E-Mail Address and/or Password.|

          Scenario: Navigating to the forgotten password page
            When I click on the "Forgotten Password" link
            Then I should be redirected to the password reset page



