Feature: Choose city and see meetups and groups 
@meetups 
Scenario: Search for events and news in different cities 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to choose city 
	And receive events and news in that city 
	Then subscriber should be able to go back to the dashbaord page 
	Then subscriber logs out 
	
@meetups2 
Scenario: Subscriber should be able to see meetups 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to see Meetups and WordCamps 
	Then subscriber logs out