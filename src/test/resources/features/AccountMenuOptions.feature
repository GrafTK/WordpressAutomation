Feature: Account Menu Options
@Menu
Scenario: Verifying Account Menu Options
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber hovers over account menu
	Then the following menu options should be visible:
	
	|Graf TK          | 
	|Edit My Profile|
	|Log Out        |

	
Scenario: Verifying Edit My Profile on Account Menu Options
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber hovers over account menu
	And subscriber clicks Edit My Profile
	Then the corresponding web page should be loaded
	
