Feature: Application login

@SmokeTest
Scenario: Homepage default login

Given User is on banking homepage
When User enter into application with "sibi" and "1234"
Then Pop up message displayed on homepage
And Cards are displayed "true"

@SmokeTest
Scenario: Homepage default login

Given User is on banking homepage
When User enter into application with "john" and "4321"
Then Pop up message displayed on homepage
And Cards are displayed "false"

@RegTest
Scenario: Homepage default login

Given User is on banking homepage
When User enter into application for sign up
| sibi | tester | sibi@gmail.com | India | 9999888800 |
Then Pop up message displayed on homepage
And Cards are displayed "false"

@RegTest 
Scenario Outline:
Given User is on banking homepage
When User enter in to application with <Username> and <Password>
Then Pop up message displayed on homepage
And Cards are displayed "false"

Examples: 
|Username|Password|
|sibi|passone|
|ravi|passtwo|
|kavi|passthree|
|hari|passfour|


