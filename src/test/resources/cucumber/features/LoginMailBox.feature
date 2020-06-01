Feature: As a user I want to login my MailBox
  @smoke
  Scenario Outline: User is logged in his MailBox
    Given the user opens Mail ru page
    When the user enter his Login name "<Login name>" and password "<Password>"
    Then the User name in the box equals Login name "at_cdp9"
    Examples:
    |Login name|Password |
    |at_cdp9   |45admin72|
    |at_cdp10  |45admin73|