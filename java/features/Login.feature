Feature: Login leaftaps application.
Scenario: To test login feature.
Given load URL.
Given Give the user name 'Demosalesmanager'
Given Give password 'crmsfa'
When Click login button.
Then Verify whether logged in.

Scenario: To test create lead functionality.
Given load URL.
Given Give the user name 'Demosalesmanager'
Given Give password 'crmsfa'
When Click login button.
Then Verify whether logged in.
Then click crmsfa link
Given Click create lead tab.
Given Fill the create lead form details.
Then click create lead button.
Then verify the title of the page.