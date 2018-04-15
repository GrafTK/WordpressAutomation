Feature: Dashboard


Background:
 Given subscriber is logged into Cybertek's Blog!  

 And profile page is loaded
 
@Prof3
 Scenario: subscriber should able to have Name configures options
 Given First Name, Last Name, Nickname input fields
 Then subscriber should able to see First Name,Last Name and Nick Name info
 And Default choosen name should be displayed
 Then subscriber should be able to click on  display name Publicly as to change name 
 Then subscriber logs out
 
 @Prof4
 Scenario: subscriber should able to have Contact Info configures options
 When subscriber click on email required input field
 Then subscriber should be able to change an email address
 When subscriber click on Website input field
 Then subscriber should be able to insert a Website address 
 When subscriber should click on Update Profile 
 Then updated profile page should be displayed
 	Then subscriber logs out