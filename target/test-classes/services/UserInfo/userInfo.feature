#Author: Shailesh

Feature: Users information 
Background:
    * url baseurl
  
    Scenario: No. of users 
    Given path 'users'
    And params { page : '1'}
    When method get
    Then status 200
    #validate response
    And match response.data[*].id contains [1,2]
   # And match response.data[*].first_name contains ['George', 'Tobias', 'Emma']
    
   # And match response.data contains {id : '#notnull', first_name:'#string'}
   
   
    Scenario: Single user information 
    
      Given path 'users'
    And params { page : '1'}
    When method get
    Then status 200
    * def name =  response.data[0].first_name
     * print name
    
    
    Given path 'users/1'
    When method get
    Then status 200
    #validate response
    * match response.data.first_name == name
    
    Scenario: Negative check for no user found 
      Given path 'users/23'
    When method get
    Then status 404
    #validate response
    