@Login
Feature: Check login functionality of hpcl

  Scenario: Login with valid credentials
    Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
    When Admin enter username "admin" and password "1"
    And Click on login button
    Then Admin must login and dashobord should display

  Scenario: Login with invalid username and valid password
    Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
    When Admin enter username "admin123" and password "1"
    And Click on login button
    Then Admin must login and dashobord should display


  Scenario: Login with valid username and invalid password
    Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
    When Admin enter username "admin" and password "123"
    And Click on login button
    Then Admin must login and dashobord should display

  Scenario: Login with blank field
    Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
    When Admin enter username "" and password ""
    And Click on login button
    Then Admin must login and dashobord should display
    
