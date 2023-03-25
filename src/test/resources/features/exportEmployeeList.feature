@ee
Feature: Export employee list


  Scenario Outline: User should be able to export the employee list

    Given The user logged in as "<user>"
    When the user writes "find employee" in the search box and hits the enter
    Then the user should be able to display the find employee page
    When the user clicks on more button
    Then the pop up should appear
    When the user clicks on export to Excel
    Then the Excel file should have been downloaded

    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |





