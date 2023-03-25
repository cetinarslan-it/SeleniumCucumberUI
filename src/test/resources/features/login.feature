@login
Feature: Login function

  Scenario Outline: User login to the application as an HR
    Given User enters "<userType>" information
    Then User should login
    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |

  Scenario Outline: User should not be able to login with wrong credentials
    Given User enters "<username>" and "<password>"
    Then User should not login

    Examples:
      | username               | password |
      | user1                  | UserUser |
      |                        | UserUser |
      | hr1@cybertekschool.com |          |
      | hr1@cybertekschool.com | abc123   |
      |                        |          |

