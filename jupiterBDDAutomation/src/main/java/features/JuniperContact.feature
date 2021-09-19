Feature: Verify Juniper application

  Scenario: Navigate to Contact page and validate mandatory fields functionality
    Given User is on Home Page
    And User Navigates to Contact page
    When I click on Submit button
    Then I get mandatory fields validation
    And I enter data in all mandatory fields
    Then Validate errors are gone

  Scenario: Navigate to Contact page and validate successful submission message
    Given User is on Home Page
    And User Navigates to Contact page
    And I enter data in all mandatory fields
    Then successful submission message appears

  Scenario Outline: Navigate to Contact page and validate errors when invalid data is entered in mandatory fields
    Given User is on Home Page
    And User Navigates to Contact page
    And I enter Forename as "<Forename>"
    And I enter Email as "<Email>"
    And I enter Message as "<Message>"
    When I click on Submit button
    Then I get validation errors
    Examples:
      |Forename   |Email      |Message   |
      |           |joseph .com|          |
      |           |hghgvgfhg |          |

  Scenario: Navigate to Shop page and validate items added in the cart
    Given User is on Home Page
    And User Navigates to Shop page
    And User clicks on Buy button to add items
    Then Verify the items in the cart
