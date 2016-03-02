@TestinPOM
Feature: NSP POM Draft to POM Final

Scenario: Check End to End from POM Draft to Sales Final
   Given I am logged in as a "POM" user in SSO
    When I search an existing NSP
    And I move to PASS through SFA
    Then I should be in PASS and load the NSP
    And I am checking the errors and correcting it