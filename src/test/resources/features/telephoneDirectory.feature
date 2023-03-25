Feature: Display telephone directory

  Scenario Outline: User should be able to display telephone directory

    Given The user logged in as "<user>"
    When the user writes telephone directory in the searchbox and hits enter
    Then the user should be navigated to the telephone directory webpage


Examples:

| user               |
| hr_username        |
| helpdesk_username  |
| marketing_username |