Feature: User Authentication (Login and Logout)

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username "Admin" and password "admin123"
    Then the user should be redirected to the dashboard

  Scenario: Failed login with invalid credentials
    Given the user the redirects back to login page
    When the user enters invalid username "wrong" and password "wrong123"
    Then an error message "Invalid credentials" should be displayed

  Scenario: Failed login with blank credentials
    Given the user goes back to the login page
    When the user submits the login form with blank fields
    Then message "Username and password cannot be empty" has to be displayed

  Scenario: User logout
    Given the user is logged in
    When the user clicks the logout button
    Then the user should be redirected to the login page