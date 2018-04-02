@DashF
Feature: Dashboard 

Scenario: Subscriber should be able click on Dashboard 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to read the recent comments
	
	
	
Scenario: Subscriber should be able to comment on recently published activities 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	And subscriber should see the recent activities 
	When subscriber clicks on one of posts
	Then post page should be loaded 
	Then subscriber should be able to reply and comment
	
	
