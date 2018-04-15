Feature: Dashboard

Background:
 Given subscriber is logged into Cybertek's Blog!
 And profile page is loaded
 
 @Prof1
 Scenario: subscriber should able to have Personal Options configures 
 Given Admin Color Scheme options
 When Subscriber should be able to choose any scheme color option
 Then background have to change to that subscriber choosen color 
 Then subscriber logs out
 
 @Prof2
 Scenario: subscriber should able to have Name configures options
 Given Username input field
 And subscriber would not be able to click on it 
 And  Username input field is Graf
 Then subscriber logs out