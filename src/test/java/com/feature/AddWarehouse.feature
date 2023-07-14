@Addwarehouse
Feature: Add wraehouse Functionality

  Scenario: Add one warehouse with two rack
  Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
  When Admin enter username "admin" and password "1"
  And Click on login button
  Then Admin must login and dashobord should display
  And Admin enter warehouse number "1" and click on Add button
  And Admin enter warehousname "Pooja" and rack number "2" and click on next button
  And Admin enter rack name1 "m1" and rack name2 "m2" and click on finish button
  And Warehouse Added Successfully
  
  
  Scenario: Try to add warehouse without entring warehouse number
  Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
  When Admin enter username "admin" and password "1"
  And Click on login button
  And Admin does not enter warehouse number and click on Add button
  Then Warehouse Not Added
  
  
  Scenario: Try to enter warehouse without rack number
    Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
    When Admin enter username "admin" and password "1"
    And Click on login button
    Then Admin must login and dashobord should display
    And Admin enter warehouse number "1" and click on Add button
    And Admin enter warehousname "MatePooja" and does not enter rack number and click on next button
    Then Warehouse Not Added
