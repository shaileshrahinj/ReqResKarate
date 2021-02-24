#Author: Shailesh

Feature: Users information 
Background:
    * url baseurl
  
    Scenario: User Login 
    Given path 'login'
    And request
    """
       {
        "email": "eve.holt@reqres.in",
        "password": "pistol"
       }
   """
   When method post
   Then status 200