Feature: WordlsCamps and News 
@worldcamps
Scenario: Subscriber should be able see WorldCamps 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to see upcoming WorldCamps 
	
	
@worldcamps2
Scenario: Subscriber should be able to read news 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Dashboard 
	Then Dashboard page should be loaded 
	Then subscriber should be able to see news 
	