Feature: Book Store Login

  Scenario Outline: Successful login with valid credentials

    Given I am on Books Home Page
    When I click on Login button on Home Page
    When I enter username "<username>" and password "<password>"
    Then I should be redirected to the profile page
    Then I verify that I am logged in with "<username>"

    Examples:
      | username | password |
      | testuser | Test@123 |