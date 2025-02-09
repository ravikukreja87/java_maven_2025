Feature: Cart Items Total
	In order to check the total amount charged to the user along with taxes for buying products from sauce demo ecom portal
	As a standard user
	I want to successfully place an order with correct amount and totals
	
Scenario: Order placed successfully with two products
	Given User logs in successfully to sauce demo web application
	When User adds Bolt T-Shirt and Red T-Shirt to the cart
	And Click on Cart Icon
	And Clicks on Checkout button
	And enters first name as Jon, last name as Tom, zip code as 12345
	And Click on Continue button
	And Clicks on Finish button
	Then Thank you for your order! must be displayed to the user
	And User must be on checkout-complete page


Scenario: Order placed successfully with correct amount and tax calculations
	Given User logs in successfully to sauce demo web application
	When User adds Bolt T-Shirt and Red T-Shirt to the cart
	And Read and store the prices of added products
	And Click on Cart Icon
	And Clicks on Checkout button
	And enters first name as Jon, last name as Tom, zip code as 12345
	And Click on Continue button
	Then total of added products must be displayed correctly under Price Total Item Total label
	And 8 percent tax must be added to item total
	And validate Total label
	When Clicks on Finish button
	Then Thank you for your order! must be displayed to the user
	And User must be on checkout-complete page