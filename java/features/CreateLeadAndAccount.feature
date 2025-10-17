Feature: Login leaftaps application and create lead and account

Scenario Outline: To test create lead functionality.
Given load URL.
Given Give the user name 'Demosalesmanager'
Given Give password 'crmsfa'
When Click login button.
Then Verify whether logged in.
Then click crmsfa link
Given Click create lead tab.
And Enter the company <companyName>
And Enter the first  <firstName>
And Enter the last <lastName>
And Enter the title <title>
Given Fill the create lead form details.
Then click create lead button.
Then verify the title of the page.

Examples:

|companyName|firstName|lastName|title|
|Google|Arun|Prasath|Welcome to Google|
|TCS|Arun|Prasath|Welcome to TCS|
|CTS|Arun|Prasath|Welcome to CTS|