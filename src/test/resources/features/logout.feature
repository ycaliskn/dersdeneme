Feature: register user

  @TestCase04
  Scenario: logout_user

    Given Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully
    And Click on Signup / Login button
    Then  Verify Login to your account is visible
    And Enter correct email address and password
    Then Click login button
    Then Verify that Logged in as username is visible
    Then  Click 'Logout' button
    And Verify that user is navigated to login page