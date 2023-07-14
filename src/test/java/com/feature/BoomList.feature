@Boom
Feature: Check Add User Functionality

Scenario: Add User
  Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
  When Admin enter username "admin" and password "1"
  And Click on login button
  Then Admin must login and dashobord should display
  When Admin click on sparelist and Boom
  And Admin enter all data in list form and click on add button
  Then Boom List data added Successfully