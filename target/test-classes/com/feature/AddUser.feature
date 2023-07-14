@AddUser
Feature: Check Add User Functionality

Scenario: Add User
  Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
  When Admin enter username "admin" and password "1"
  And Click on login button
  Then Admin must login and dashobord should display
  When Admin click on setting and adduser
  And Admin enter on add user button
  And Admin enter all data and click on add user button
  Then User Add Successfully