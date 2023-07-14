@AddSupplier
Feature: Add Supplier Functionality

  Scenario: Add Supplier
    Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
    When Admin enter username "admin" and password "1"
    And Click on login button
    Then Admin must login and dashobord should display
    And Admin Enter on suppilers adn add supplier
    When Admin enter the Supplier ID as "1012"
    And Admin enter the Supplier Name as "Pooja EnterPrise"
    And Admin enter the ERP code as "P102"
    And Admin enter the Supplier Address as "Nashik"
    And Admin enter the Email Address as "jadhavpooja965@gmail.com"
    And Admin enter the Contact No as "9865323265"
    And Admin select the Supplier Type 
    And Admin enter the GST No as "Poo102"
    And Admin upload a file
    And Admin submit the form
    Then Supplier details should be saved successfully

  Scenario: Enter Supplier Details
    Given Open browser and hit the url "https://www.manasvi.tech/Mayur_inventory/"
    When Admin enters username "admin" and password "1"
    And Admin click on login button
    Then Admin enter all data and click on add button