Feature: Dashboard

 
 
 
 Scenario: subscriber should able to have About Yourself configures options
 Given subscriber is logged into Cybertek's Blog! 
 And profile page is loaded  
 Given Biographycal Info Checkbox
 When subscriber to able click on Biographycal Info Checkbox checkbox 
 Then subscriber able to type some information 
 Given Profile Picture Gravatar
 When subscriber able to click on Gravatar 
 Then subscriber able to see and change own profile picture
 
 
@notes
 Scenario: subscriber should able to have Account Management configures options
 Given subscriber is logged into Cybertek's Blog! 
 And profile page is loaded 
 Given New Password button 
 When subscriber clicks on Generate Password button
 Then subscriber able Change and Hide password
 Given Sessions button
 When subscriber clicks on Log Out Everwhere else button
 Then subsriber able to logout from webPage