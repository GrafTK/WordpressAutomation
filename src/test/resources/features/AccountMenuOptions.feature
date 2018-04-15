Feature: Account Menu Options
@account
Scenario: Verifying Account Menu Options
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber hovers over account menu
	Then the following menu options should be visible:
	|Graf        | 
	|Edit My Profile|
	|Log Out        |
	And subscriber logs out
	

	@account2
Scenario: Verifying Edit My Profile on Account Menu Options
	Given subscriber is logged into Cybertek's Blog! 
	And profile page is loaded 
	When subscriber hovers over account menu
	And subscriber clicks Edit My Profile
	Then the corresponding web page should be loaded
	And subscriber logs out
