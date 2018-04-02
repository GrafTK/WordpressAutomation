@Commenting
Feature: Commenting 


Scenario Outline: Posting a comment
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	When subscriber clicks on "postName"
	Then subscriber should be able to post a <"comment">
	Then I created new step

	Examples:
	|comment                             |
	|Really enjoyed the post             |
	|Will you post more about this topic?|

Scenario Outline: Replying to a comment
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber clicks on Cybertek's Blog! 
	Then Cybertek's Blog home page should be displayed 
	When subscriber clicks on "postName"
	Then subscriber should be able to <"reply"> to <"comments">
	
	Examples:
	|reply      |comments|
	|Regression?|test    |
	