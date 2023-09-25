Feature: login user

  @TestCase02
  Scenario: login_correct_mail_pwd

  Then Verify that home page is visible successfully
    And Click on Signup / Login button
  Then  Verify Login to your account is visible
  And Enter correct email address and password
  Then Click login button
  Then Verify that Logged in as username is visible
  And Click Delete Account button
  Then Verify that ACCOUNT DELETED! is visible

  @TestCase03
  Scenario: login_incorrect_mail_pwd

    Then Verify that home page is visible successfully
    And Click on Signup / Login button
    Then  Verify Login to your account is visible
    And Enter incorrect email address and password
    Then Click login button
    And Verify error Your email or password is incorrect! is visible
