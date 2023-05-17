
Feature: Login Test
  As user I want to login into Saucedemo website


  @smoke @regression
    Scenario Outline: User should login successfully with valid credentials
      Given I am on homepage
      When  I enter username "<username>"
      And  I enter password"<password>"
      And I click on login button
      Then Verify the text "<expectedText>"
#      And I should login successfully
      Examples:
      | username      | password     | expectedText |
      | standard_user | secret_sauce | Products     |