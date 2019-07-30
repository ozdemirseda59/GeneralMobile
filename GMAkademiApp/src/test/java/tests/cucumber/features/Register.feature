@Register
Feature: Successful Register Section

  Scenario Outline: Register the app successfully as a GM User
    Given I am on the user selection screen
    When I click General Mobile Kullanicisiyim text
    And  I click Uye Ol text
    And I fill Name field with "<name>" and Last name field with "<lastName>" and Mobile phone field with "<mobilePhone>"  and Password field with "<password>" and Password Again field with "<passwordAgain>" and click Sign in on Register Page
    Examples:
      | name | lastName | mobilePhone | password | passwordAgain |
      |Seda  | Ozdemir  | 5444479176  |12345TesT!|12345TesT!  |