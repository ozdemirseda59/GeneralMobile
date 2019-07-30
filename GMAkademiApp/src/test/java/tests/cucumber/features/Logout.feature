@Logout
Feature: Successful Logout Section
  Background:
    Given I am on the user selection screen
    And I click General Mobile Kullanicisiyim text
    And I fill Email field with "ozdemirseda59@gmail.com" and Password field with "12345TesT!" and click Sign in on Login Screen

  Scenario:Logout the app successfully as a GM User
    When I click Menu on Main Screen
    And I click Cıkıs Yap button
    Then I should see User Selection Screen
