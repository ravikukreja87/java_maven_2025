Feature: Login Functionality
	In order to test the login functionality of Sauce Demo Application
	As a visual_user
	I want to successfully login into the application
	
Scenario: Successful login with valid credentials
	Given User opens Chrome browser
	And User is on login page
	When User enters valid username standard_user and password secret_sauce
	Then User should successfully login
	And User should be on inventory page
	And Browser is closed

Scenario: Unsuccessful login with invalid credentials
	Given User opens Chrome browser
	And User is on login page
	When User enters valid username standard_user and invalid password secret
	Then Login should fail
	And User should be on login page
	And Browser is closed
