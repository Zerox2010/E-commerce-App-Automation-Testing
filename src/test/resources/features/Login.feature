Feature: user could login with valid data

  #Test Scenario 1
  Scenario: user login with valid username and password
  Given user open the browser
  And user navigates to login page
  When user enter valid username and password
  And user click on login button
  Then user could login successfully
