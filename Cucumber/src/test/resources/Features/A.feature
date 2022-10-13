Feature:To test login functionality
Scenario: verify login is successful with valid data
Given Browser is open
And User is on login page
When user should enter Un and Pwd
Then User should navigate to home page
