@AddProduct 
Feature: Add Subrack Functionality

  Scenario: Add Product
  Given Open browser and hit url "https://www.manasvi.tech/Mayur_inventory/"
  When Admin enter username "admin" and password "1"
  And Click on login button
  Then Admin must login and dashobord should display
  And Admin enter click on addproduct option
  And Admin enter product id "112" name "Pen" 
  And Admin select wearehouse rack subrack
  And Admin enter price "1000" and opening stock "100"
  And Admin select VDE and Machine name
  And Admin select supllier name and quality
  And Admin click on add product button
  And Produt added sucessfully