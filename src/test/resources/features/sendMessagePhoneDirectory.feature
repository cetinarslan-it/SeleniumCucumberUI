Feature: Send message from phone directory

  Scenario Outline: User should be able to send message to employee from the telephone directory

    Given The user logged in as "<user>"
    When the user writes telephone directory in the searchbox and hits enter
    Then the user should be navigated to the telephone directory webpage
    When the user clicks on Arben Istrefi
    Then the user should be navigated to the emplooyee's page
    When the user clicks on send message
    And writes "hello" in the message box and hits the enter
    Then the message should have been sent

    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |



