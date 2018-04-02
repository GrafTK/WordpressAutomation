@Search
Feature: Search Functionality

Scenario Outline: Searching by the author name
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	When subscriber searches by <"author name">
	Then corresponding web page with results should appear
	
	Examples:
	|author name|
	|Tech17     |
	|Tesla      |


Scenario Outline:  Searching by invalid input

Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	When subscriber searches by <"invalid input">
	Then the web page with the message "No results. Try again, would you kindly?"  should be loaded

	Examples:
	|invalid input|
	|#$%          |
	|123          |
	|""           |
