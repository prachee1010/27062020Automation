
Feature: Tricentis Search Feature

  Scenario: Search with valid keywords
    Given User is on homepage
    When User search with BMW keyword
    Then relevant results should be displayed
