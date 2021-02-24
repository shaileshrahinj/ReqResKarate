#Author: Shailesh

Feature: register user 
Background:
    * url baseurl
  
    Scenario: User Login 
    Given path 'register'
    And request
    """
       {
        "email": "eve.holt@reqres.in",
        "password": "pistol"
       }
   """
   When method post
   Then status 200
 