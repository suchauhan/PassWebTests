@TestinPASS
Feature: NSP Sales Draft to Sales Final

  Scenario: Check End to End from Sales Draft to Sales Final
    Given I am logged in as "Admin" user in Passweb
    When I should be in PASS and load the NSP
    Then I should be at the home page
    When I select Entity and Product and adding it manually
      | QCC | LD Voice - International (QCC) |
    Then Product should get added
    And Component Row should get added
    And Component Row should get Deleted
    When I should be able to compare MassUpdate and UpdateKeyfields for the product
    And I am checking the errors and correcting it
    When I submitting the NSP to POM
    Then NSP status should be changed to Sales Final

