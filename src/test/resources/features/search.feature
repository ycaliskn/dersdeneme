Feature:

  @TestCase09
  Scenario: search_product

    Given Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
