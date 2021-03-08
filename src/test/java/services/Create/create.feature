
Feature: Create a user
Background:
    * url baseurl
  
    Scenario: Create a user test
    Given path 'users'
    And request
    """
       {
        "name": "morpheus",
        "job": "leader"
       }
   """
    When method post
    Then status 201
    #validate response
    * print response
    And match response.name == "morpheus"
   And match response.createdAt == '#notnull'