@Login
  Feature: Successful Login Section

  Scenario Outline: Login the app successfully as a GM User
    Given I am on the user selection screen
    When I click General Mobile Kullanicisiyim text
    And I fill Email field with "<email>" and Password field with "<password>" and click Sign in on Login Screen
    Then I should see "<email>" on my profile screen
    Examples:
      | email                 | password |
      |ozdemirseda59@gmail.com|12345TesT!|
