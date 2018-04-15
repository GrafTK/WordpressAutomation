Feature: Dashboard Help Functionality 


@dashboardHelp
Scenario: Verifying Dashboard Help Functionality Options
	Given subscriber is logged into Cybertek's Blog! 
	When subscriber clicks on Dashboard  
	Then Dashboard page should be loaded  
	When subscriber click on Help functionality
	Then the following options should be displayed in Help: 
	|Overview  |
	|Navigation|
	|Layout    |
	|Content   |
	And they all should be clickable
	Then subscriber logs out
		
	@dashboardHelp2	
Scenario: Verifying Dashboard Help Link Options 
	Given subscriber is logged into Cybertek's Blog! 
	When subscriber clicks on Dashboard  
	Then Dashboard page should be loaded 
	When subscriber click on Help functionality
	Then following links should be displayed under Help's For More Information: 
	|Documentation on Dashboard|
	|Support Forums                | 
	Then subscriber logs out
