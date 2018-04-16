@cybertekblog
Feature: Cybertek's Blog! functionality 

Scenario: Click on Cybertek's Blog!    
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	
Scenario: Verifying Cybertek's Blog! menu option
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber hovers over Cybertek's Blog! 
	Then menu with only "Visit Site" option should be displayed
	Then subscriber logs out

	