Feature: SDET Test Cases


  Background: 
    Given User is on TekSchool page
    And User Click on Test Environment link
    And User should see Test Environment page
    
      @SDET_005
  Scenario: SDET2019AUG_SDET_005_Execution
    When User click on component dropdown menu should display
    And User click on image of product the product detailed should list on right side of the page 
    And User should click on Samsung galaxy tab
    And User should be able to see the blue button with label add to the cart
    Then User should be able to see success message that products are added to the cart