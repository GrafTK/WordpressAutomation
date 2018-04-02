Feature: Dashboard

Background:
 Given subscriber is logged into Cyberteks's Blog!
 And profile page is loaded
 
 
 Scenario: subscriber should able to have About Yourself configures options
 Given Biographycal Info Checkbox
 When subscriber to able click on Biographycal Info Checkbox checkbox 
 Then subscriber able to type some information 
 Given Profile Picture Gravatar
 When subscriber able to click on Gravatar 
 Then subscriber able to see and change own profile picture
 
 
 Scenario: subscriber should able to have Account Management configures options
 Given New Password button 
 When subscriber clicks on Generate Password button
 Then subscriber able Change and Hide password
 Given Sessions button
 When subscriber clicks on Log Out Everwhere else button
 Then subsriber able to logout from webPage