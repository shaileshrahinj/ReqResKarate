
Feature: Delete user functionality
Background:
    * url baseurl
  
    Scenario: Delete  user test
    Given path 'users/2'
    When method delete
    Then status 204
    #validate response
    * print response
    #And match response.job == "leader2"
   #And match response.updatedAt == '#notnull'