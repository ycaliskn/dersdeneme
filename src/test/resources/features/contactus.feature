Feature: register user

  @TestCase06
  Scenario: contact_us

    Given Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully
    Then Click on Contact Us button
    And Verify GET IN TOUCH is visible
    Then Enter name, email, subject and message
    Then Upload file
    And Click Submit button
    Then Click OK button
    Then Verify success message Success! Your details have been submitted successfully. is visible
    And Click Home button and verify that landed to home page successfully