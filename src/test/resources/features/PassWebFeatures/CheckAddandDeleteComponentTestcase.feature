@PilotRegression
Feature: Verify Add and Delete Component Functionality

  Scenario Outline: Check AddAndDeleteComponent functionality from Sales Draft to Sales Final
    Given I am logged in as a "ssocommercial" user in SSO
    When I search an existing LQ commercial Opportunity
    When I create a new NSP
    And I move to PASS through SFA
    Then I should be in PASS and create the NSP in PASS
    And I add the competitor info
    When I select "<Entity>" and "<Product>" and adding it manually
    Then Product should get added
    And Component Row should get added
    And Component Row should get Deleted

    Examples: 
      | Entity | Product                          |
      | QCC    | Metro Ethernet (LCTL)            |
      | LCTL   | Dedicated IP Bundle (LCTL)       |
      | QC     | Optical Wavelength Service (QC)  |
      | QC     | Metro Ethernet (QC)              |
      | LEQ    | Dedicated IP Bundle (LEQ)        |
      | LEQ    | Metro Ethernet (LEQ)             |
      | QCC    | Conferencing (QCC)               |
      | QCC    | iQ Standard (QCC)                |
      | LEQ    | Dedicated IP Port (LEQ)          |
      | QCC    | LD Voice - Domestic (QCC)        |
      | QCC    | LD Voice - International (QCC)   |
      | QCC    | SIP Trunk(QCC)                   |
      | QCC    | E-Line (QCC)                     |
      | QCC    | rivate Line Domestic (QCC)       |
      | QCC    | iQ Bundle (QCC)                  |
      | QCC    | Ethernet Private Line (QCC)      |
      | QCC    | Optical Wavelength Service (QCC) |
      | LCTL   | Dedicated IP Bundle (LCTL)       |
