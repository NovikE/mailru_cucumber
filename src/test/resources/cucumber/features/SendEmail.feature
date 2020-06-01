Feature: As a user I want to sent e-mail

  @smoke
  Scenario: Send e-mail
    Given the user opens Mail ru page
    And the user enter his Login name "at_cdp9" and password "45admin72"
    When I click Compose button
    And I fill Send to address "lena.khalopitsa@gmail.com" and subject "Cucumber expressions" and save e-mail in draft
    And I open draft folder
    And I find the e-mail and send with Send to address "lena.khalopitsa@gmail.com" and subject "Cucumber expressions"
    Then There is email in Sent folder with subject "Cucumber expressions"