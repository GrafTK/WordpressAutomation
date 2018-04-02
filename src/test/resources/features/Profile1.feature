Feature: Dashboard

Background:
 Given subscriber is logged into Cyberteks's Blog!
 And profile page is loaded
 
 Scenario: subscriber should able to have Personal Options configures 
 Given Admin Color Scheme options
 When Subscriber able to click color sheme options
 Then background have to change to that subscriber choosen color 
 
 
 
 Scenario: subscriber should able to have Name configures options
 Given Username checkbox
 Then Username checkbox won't be able to click on it
 Then subscriber doesn't able to type anything on those checkbox