Feature: Upload documents

  Scenario: Test document upload
    Given User is on homepage
    When Click on Automobile link
    And Click on Enter Insurance Data
    And Click on Open button and upload document
    Then Document should be uploaded
