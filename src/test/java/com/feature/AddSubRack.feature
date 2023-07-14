@Addsubrack 
Feature: Add Subrack Functionality

  Scenario: Add subrack 
  Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
  When Admin enter username "admin" and password "1"
  And Click on login button
  Then Admin must login and dashobord should display
  And Admin enter click on sub rack option
  And Admin select warehouse name and and rack name
  And Admin enter "2" in sub rack
  And Admin enter subrack name1 "m1_001" and rack name2 "m1_002" and click on Add Subrack button
  And subrack added sucessfully