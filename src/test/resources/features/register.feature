Feature: register user

  @TestCase01
  Scenario: register_user

    Then Verify that home page is visible successfully
    And Click on Signup / Login button
    Then Verify New User Signup! is visible
    And Enter name and email address
    And Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, AddressTwo, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    Then Verify that Logged in as username is visible
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button



  @CreateAccount
  Scenario: create_account

    And Click on Signup / Login button
    And Enter name and email address
    And Click Signup button
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, AddressTwo, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button


  @TestCase05
  Scenario: register_user_with_existing_mail

    Then Verify that home page is visible successfully
    And Click on Signup - Login button
    Then Verify New User Signup! is visible
    And Enter name and already registered email address
    And Click Signup button
    Then Verify error Email Address already exist! is visible