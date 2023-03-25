Feature: Find employee

  Scenario Outline: User should be able to find employees by search box

    Given The user logged in as "<user>"

    When user writes find employee in searchbox and hits the enter
    Then the user should be navigated to the find employee page
    When the user write Arben to the search box on the page and hits the enter
    Then the user should be able to display Arbens page

    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |
