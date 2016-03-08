@PilotRegression
Feature: Import QVO Quote in Passweb

  Scenario: Check that import PP quote is working for all product types
    Given I am logged in as a "ssocommercial" user in SSO
    When I create a commercial opportunity
    When I create a new NSP
    And I move to PASS through SFA
    Then I should be in PASS and create the NSP in PASS
    And I add the competitor info
    When I import the QVO Quote in Passweb
    Then I should be able import QVO Quote successfully