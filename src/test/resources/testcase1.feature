Feature: Retailsys login functionality

  Scenario:Check login is successful with valid credentials

    Given I open the browser
    When I login to the Retailsys applicaiton

    Then  I use password to login