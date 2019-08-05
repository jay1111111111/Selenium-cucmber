Feature: I am able to submit Contact Us page
Scenario Outline: I submit the valid detail on Contact Us page
Given I am able to acess "<url>"
When I click on Contact Us page
Then I enters the "<Firstname>" firstname
And I enter the "<Last Name>" last name
And I enter "<Email Address>" email address
And I enter the "<Comments>" comment
When I click on Submit button
Then I am able to sucessfully submit the request
Examples:
|  url                              |Firstname     |Last Name      |Email Address      |Comments  |
|http://www.webdriveruniversity.com/|Mrutyunjay    |Biswal         |mj.biswal@gmail.com|Test      |