Feature: API Validation
  

 
 @TestCase_01  @Test
  Scenario: Validate API details
    Given I trigger the get API
    Then I verify API statuscode
    Then I verify title


  @TestCase_02  @Test
  Scenario: Validate userid
    Given I trigger the get API
    Then I verify API statuscode
    And I verify userid

  
  
  
  