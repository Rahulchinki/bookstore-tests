Feature: Book Search

  Scenario Outline: Valid book search returns result

    Given I am on Books Home Page
    When I click on Login button on Home Page
    When I enter username "<username>" and password "<password>"
    Then I should be redirected to the profile page
    Then I click on Book store menu
    Then I am on Book search page
    When I search for "<bookName>"
    Then I should see "<bookName>" in the search results

    Examples:
      | username | password | bookName |
      | testuser | Test@123 | Git Pocket Guide |


  Scenario Outline: In-valid book search returns result

    Given I am on Books Home Page
    When I click on Login button on Home Page
    When I enter username "<username>" and password "<password>"
    Then I should be redirected to the profile page
    Then I click on Book store menu
    Then I am on Book search page
    When I search for "<bookName>"
    Then I should see not  "<bookName>" in the search results

    Examples:
      | username | password | bookName |
      | testuser | Test@123 | Git Rockeocet |