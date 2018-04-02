@HomeF
Feature: Home Page Features 



Scenario: Home Page DashBoard 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	And following options should be displayed on the dashboard: 
		|Welcome To Istanbul|
		|Post               |
		|Photos of Istanbul |
		|Info               |
		|History of Istanbul|
		|About Us           |
		|Post               |
		|Photo              |
		|Tech17             |
		|Google             |
		|Search icon        |
		
		
Scenario Outline: Home Page Main Body 
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	Then Home Page Main Body has to have the <"postName"> displayed 

Examples:
		|postName     |
		|Classic Music|
		|Hello Tesla! |
		|Nature       |
		|Nature       |