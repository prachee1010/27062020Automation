Feature: Enhanced search feature

  Scenario Outline: Test search scenario with multiple test data
    Given User is on homepage
    When User search with <data> keyword
    Then relevant results should be displayed

    Examples: 
      | data   |
      | BMW    |
      | Maruti |
