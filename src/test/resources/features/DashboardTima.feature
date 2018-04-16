@dashboard
Feature: Dashboard 

Scenario: Subscriber should be able click on Dashboard 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to see the documentation
	And subscriber should be able to go back to dashboard page
	And subscriber logs out
	

Scenario: Subscriber should be able to comment on recently published activities 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
    And subscriber should be able to go to wordpress official page
    And subscriber goes back to dashboard page
	And subscriber logs out