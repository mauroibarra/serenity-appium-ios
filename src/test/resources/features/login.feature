Feature: Login Function

  @SuccessLogin
  Scenario: Login Successfull
    Given "the user" is at login page
    And login with user 'admin' and password 'admin'
    Then the user will see the form page
