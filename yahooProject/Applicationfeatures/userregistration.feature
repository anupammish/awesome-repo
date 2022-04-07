Feature: Yahoo user Registration
  
  @TC-01
  Scenario: Verify user registration
  
    Given start screen recording
    Given open browser
    And Launch Aplication
    When Enter firstName "<fname>" and LastName "<lname>"
    And Enter email "<email>"
    And Enter password "<passwd>" 
    And Enter Mobile Number "<mobnumber>"
    And Enter date of birth and enter gender
    And Click continue 
    Then User page should display
    Then stop screen recording 
    
    Examples:
     |fname|lname|email|passwd|mobnumber|
     |sdffj123|reet123|rdzlmncde123|acqwerty@123|7777777744|

    @TC-02
  Scenario: Verify user registration
    Given start screen recording
    Given open browser
    And Launch Aplication
    When Enter firstName "<fname>" and LastName "<lname>"
    And Enter email "<email>"
    And Enter password "<passwd>" 
    When Enter mobile number "<mobilenumber>"
    And Enter date of birth and enter gender
    And Click continue 
    Then Error message should display 
    Then stop screen recording 
    
    Examples:
    |mobilenumber|
    |88888888888| 
    
    
    
   
    
    
    
    
    
    
    