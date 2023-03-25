@ad
Feature: Add a department

  Scenario Outline: User should be able to add a department

    Given The user logged in as "<user>"

    When the user writes "Company Structure" in the search box and hits the enter
    Then user should be able to display the company structure.
    And user clicks on add department
    When user writes "department name" in the box and clicks on add
    Then user should be able to display the new department on the page

    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


