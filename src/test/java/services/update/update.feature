
Feature: Update a user
Background:
    * url baseurl
  
    Scenario: update  user test
    Given path 'users/2'
    And request
    """
       {
        "name": "morpheus",
        "job": "leader2"
       }
   """
    When method put
    Then status 200
    #validate response
    * print response
    And match response.job == "leader2"
   And match response.updatedAt == '#notnull'