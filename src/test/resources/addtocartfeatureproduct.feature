Feature: Validate add to cart Functionality for feature product
  Background: Feature product add to cart
    Given User opens the browser

  @Smoke
  Scenario: Add to cart Functionality feature products scenario
    #When User verify the prodcuts availaibility
    When User clicks on any feature product
    Then User is on FeatureProductdetailsPage

