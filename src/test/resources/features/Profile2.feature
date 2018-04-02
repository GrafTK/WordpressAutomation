Feature: Dashboard

Background:
 Given subscriber is logged into Cyberteks's Blog!
 And profile page is loaded
 

 Scenario: subscriber should able to have Name configures options
 Given First Name, Last Name, Nickname checkboxes
 When subscriber able to click in firstName,lastName and nickName
 Then subscriber able to type valid firstName,lastName and nickName
 And Display name publicly as checkboxes
 When subscriber able to click on option dropDown to change display name publicy
 Then subscriber able to have options in dropDown 
 
 Scenario: subscriber should able to have Contact Info configures options
 Given Email(required) checkbox
 When subscriber click on email(required) checkbox
 Then subscriber able to type an email should display
 Given Website checkbox
 When subscriber click on Website checkbox
 Then subscriber able to type an Website address should display