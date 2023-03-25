Feature: Find employees by alphabet

  Scenario Outline: User should be able to find employees by search by Alphabet

    Given The user logged in as "<user>"

    When user writes employees in searchbox and hits the enter
    Then the user should be navigated to the company employees page
    When user clicks on find employee
    Then the user should be able to display the find employee page
    When the user clicks on Search by Alphabet
    Then the letter filters should appear on the page
    When the user clicks on the letter B
    Then the user should display the Murad Boz employee


    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |