@DashENF
Feature: Choose city and see meetups and groups 

Scenario: Search for events and news in different cities 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to choose city 
	And receive events and news in that city 
	
	
Scenario: Subscriber should be able to see meetups 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to see Meetups and Groups 
	