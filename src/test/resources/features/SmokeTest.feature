Feature: Smoke Test

Scenario: Smoke Test
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	When subscriber clicks again on Cybertek's Blog! 
	Then Dashboard page should be loaded
	Then subscriber logs out