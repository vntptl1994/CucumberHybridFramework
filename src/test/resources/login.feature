Feature: Validate Login Functionality of application

  Background: Login Functionality
    Given User opens the browser

  @Smoke
  Scenario Outline: Login Functionality scenario valid credentials
    When User enters "<username>" and "<password>"
    When User clicks on login button
    Then User is successfully login
    Examples:
      | username | password |
      | vnt123@gmail.com | vnt@123 |

  @Smoke
  Scenario Outline: Login Functionality scenario invalid credentials
    When User enters "<username>" and "<password>"
    When User clicks on login button
    Then message is displayed for wrong credentials
    Examples:
      | username | password |
      | vnt1234@gmail.com | vnt@123 |
      | vnt123@gmail.com | vntp@123 |
      | vnt1234@gmail.com | vntp@123 |

    @Smoke
    Scenario:Login Functionality with null credentials
      When User click on login button without providing any credentials
      Then message is displayed for wrong credentials


