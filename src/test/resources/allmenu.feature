Feature: Validate all menu click and select options Functionality
  Background: Menu select feature
    Given User opens the browser

  @Smoke
  Scenario: Select Desktop Menu
    When User click on Desktop menu
    When User clicks on "<PC (0)>"

