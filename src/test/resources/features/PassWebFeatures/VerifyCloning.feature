@PilotRegression
Feature: Cloning of NSP

  Scenario: Check that Cloning of NSP is working
    Given I am logged in as a "ssocommercial" user in SSO
    When I search an existing LQ commercial Opportunity
    When I create a new NSP
    And I move to PASS through SFA
    Then I should be in PASS and create the NSP in PASS
    And I add the competitor info
    When I try to clone a NSP
    Then I should be able to clone successfully
