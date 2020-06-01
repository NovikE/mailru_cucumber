Feature: As a user I want to compose e-mail

  Background:
    Given the user opens Mail ru page
    And the user enter his Login name "at_cdp9" and password "45admin72"

  @smoke
  Scenario: Create new draft e-mail
    Given I click Compose button
    When I fill all data and save e-mail
    And I open draft folder
    Then there is my e-mail in draft folder