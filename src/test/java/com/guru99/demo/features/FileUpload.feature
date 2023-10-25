@All
Feature: File Upload / Download
  as customer i want the ability to upload a file
  so that file content will be available.
@Ignor
  Scenario: User can successfully upload a file
    Given I navigate to file Upload page
    And I click on AcceptAll button on Manage your Privacy
    When I click on Browse button
    And I click on terms of service checkbox
    And I click on Submit File button
    Then file is successfully uploaded