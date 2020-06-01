Feature: As a user I want to login my MailBox
  @smoke
  Scenario: User is logged in his MailBox
    Given the user opens Mail ru page
    When the user enter his Login name "at_cdp9" and password "45admin72"
    Then the User name in the box equals Login name "at_cdp9"