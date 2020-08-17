Feature: Scroll feature

  Scenario: Scroll till footer
    Given User is on homepage
    When User scrolls till end of page
    Then Footer links visible
