Feature: Loging into Application

  Scenario:
    Given Positive test validation login
    And Initialize the to "QAClickAcademy" Site
    And Click on Login link in home page to land on Secure sign in Page
    When User enters "Username" and "Password" and logs in
    Then Verify that user is successfully logged in

