@PHelp
Feature: Profile Help Functionality


Scenario: Verifying Help Links Options
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Help Functionality 
	Then following links should be displayed under For More Information: 
	|Documentation on User Profiles|
	|Support Forums                |



Scenario Outline:  Verifying Help Link Web Page
	Given subscriber is logged into Cybertek's Blog! 
  	And profile page is loaded
	When subscriber clicks on Help Functionality
	And clicks on "<linkName>" and web page should be displayed
	

	Examples:
	|link name					  |
	|Documentation on User Profiles|
	|Support Forums                |
