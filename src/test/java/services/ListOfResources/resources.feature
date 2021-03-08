
Feature: Resources information 
Background:
    * url baseurl
  
    Scenario: List of resources 
    Given path 'unknown'
    When method get
    Then status 200
    #validate response
    And match response.data[*].id contains [1,2]
     And match response.data[*].year contains [2000,2001]
   # And match response.data[*].first_name contains ['George', 'Tobias', 'Emma']
    
   # And match response.data contains {id : '#notnull', first_name:'#string'}
   
   
    Scenario: Single resource verification	
    
    Given path 'unknown'
    When method get
    Then status 200
    * def name =  response.data[1].name
    * print name
    
    Given path 'unknown/2'
    When method get
    Then status 200
    #validate response
    * match response.data.name == name
    
    