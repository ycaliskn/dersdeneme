Feature:

  @TestCase07
  Scenario: verify_test_cases_page

    Given Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully
    Then Click on Test Cases button
    And Verify user is navigated to test cases page successfully



  @TestCase08
  Scenario: verify_all_prod_detail_page

    Given Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    Then User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand


  @TestCase10
  Scenario: search_product

    Given Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully
    Then Scroll down to footer
    And Verify text SUBSCRIPTION
    Then Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible