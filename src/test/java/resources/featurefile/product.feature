Feature: Login

  As a User I want to verify that six products are displayed on page

  @sanity @regression
  Scenario Outline: verify That Six Products Are Displayed On Page
    Given I am on homepage
    When I enter username"<username>"
    And  I enter Password"<password>"
    And I click on login button
    Then Verify products per Page "<expectedProducts>"

    Examples:
    |username      |  password    |expectedProducts|
    |standard_user | secret_sauce |6               |




