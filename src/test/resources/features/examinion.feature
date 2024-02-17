Feature:


  Scenario Outline: As a user  log in the website
    When The user enters "<e-mail>"
    And   The user enters "<password>"
    And  The user clicks on the Login button
    When The user verifies on the homepage
    Examples:
      | e-mail      | password    |
      | sa@test.com | Test123456! |
      | oa@test.com | Test123456! |



