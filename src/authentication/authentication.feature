Feature: User Authentication
  User should be able to login to the application with valid username and password

  Scenario: User enters valid username and valid password
    User should be able to authenticate to the app using valid username and password

    Given user launches browser
    When user enters the url
    And user clicks on clinic link
    Then user is navigated to clinic page

