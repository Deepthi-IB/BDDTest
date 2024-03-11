Feature: Verify Gmail Compose Functionality

Scenario: Verify Compose email functionality 
Given User is on Gmail Login page
When User enters username as "deepthi@gmail.com" and password as "test@123"
And clicks the login button
Then Home page is displayed
When User clicks on Compose button
And enter the email’s subject as "Automation Testing" and body as "Hope this email finds you well" and recipient field as "deepthikarnam12@gmail.com"
Then click on CC and BCC links and enter in CC field as "deepthikarnam83@gmail.com" and in BCC field as "deepthikarnam256@gmail.com" 
When User clicks Send button and email is sent


