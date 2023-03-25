Feature: Display company structure


  Scenario Outline: User should be able to display company structure

    Given The user logged in as "<user>"

    When the user writes "Company Structure" in the search box and hits the enter
    Then user should be able to display the company structure

    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |