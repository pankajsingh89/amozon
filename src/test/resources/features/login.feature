Feature: Amazon Login

  Scenario: Navigate to sign-in page
    Given I open the Amazon India homepage
    When I click on Sign in
    Then I should see the sign-in page

  Scenario: Sign in with email and password
    Given I open the Amazon India homepage
    When I click on Sign in
    Then I should see the sign-in page
    When I enter mobile number or email "8506802690"
    And I click the Continue button
    Then I should see the password field
    When I enter password "TestPassword123"
    And I click the Sign In button