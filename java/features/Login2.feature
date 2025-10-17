Feature: Create Account in  leaftaps application.
Scenario: To test create Account functionality.
Given load URL.
Given Give the user name 'Demosalesmanager'
Given Give password 'crmsfa'
When Click login button.
Then Verify whether logged in.
Then click crmsfa link
Given Click Account tab.
Given Fill the create Account form details.
Then click create Account button.
Then verify Account and title of the page.