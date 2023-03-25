@test
  Feature:Sending Message

    Scenario Outline: User should be able to find employees by search box

      Given The user logged in as "<user>"
      When the user clicks on send message, message box should be enabled
      Then user writes something in the box
      And the user clicks on send
      And the user should be able to display the message on the home page

      Examples:

        | user               |
        | hr_username        |
        | helpdesk_username  |
        | marketing_username |
