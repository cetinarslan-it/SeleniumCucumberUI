@wip
Feature: Uploading file

  Scenario Outline: User should be able to upload file

    Given The user logged in as "<user>"
    When the user clicks on send message box, the box should be enabled
    Then user clicks on send file button

    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |




