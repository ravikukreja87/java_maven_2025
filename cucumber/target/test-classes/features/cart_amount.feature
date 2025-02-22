@regression
Feature: Cart Items Total
  In order to check the total amount charged to the user along with taxes for buying products from sauce demo ecom portal
  As a standard user
  I want to successfully place an order with correct amount and totals

Scenario: Order placed successfully with two products

	And User is on login page
	When User enters valid username standard_user and password secret_sauce
	Then User should successfully login
	And User should be on inventory page

	When User adds Bolt T-Shirt and Red T-Shirt to the cart
	And Click on Cart Icon
	And Clicks on Checkout button
	And enters first name as "Jon", last name as "Tom", zip code as 12345
	And Click on Continue button
	And Clicks on Finish button
	Then Thank you for your order! must be displayed to the user
	And User must be on checkout-complete page


  Scenario Outline: Order placed successfully for DT with correct amount and tax calculations
    Given User is on login page
    When User enters valid username standard_user and password secret_sauce
    Then User should successfully login
    And User should be on inventory page
    When User adds Bolt T-Shirt and Red T-Shirt to the cart
    And Click on Cart Icon
    And Read and store the prices of added products
    And Clicks on Checkout button
    And enters first name as "<FirstName>", last name as "<LastName>", zip code as <ZipCode>
    And Click on Continue button
    Then total of added products must be displayed correctly under Price Total Item Total label
    And <Tax> percent tax must be added to item total
    And validate Total label
    When Clicks on Finish button
    Then Thank you for your order! must be displayed to the user
    And User must be on checkout-complete page

    Examples:
      | FirstName | LastName | ZipCode | Tax |
      | Donald    | Trump    | 45678   | 8   |
      | Elon      | Musk     | 78945   | 8.1 |
      | Temp      | TempLast | 9999999 | 7   |



