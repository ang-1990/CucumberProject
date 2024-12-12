Feature: Uber Booking Feature


  @Smoke
  Scenario: Booking Cab
    Given User wants to select a car "Hyundai" from uber app
    When The car is selected and pick up is "Guadalajara" and drop is "Mexico `city"
    Then Driver starts journey
    And Driver ends the journey
    Then user pays 1000 MXN

    @regression
    Scenario: Booking Cab mini
    Given User wants to select a car "mini" from uber app
    When The car is selected and pick up is "Guadalajara" and drop is "Tonala"
    Then Driver starts journey
    And Driver ends the journey
    Then user pays 1000 MXN

  @Smoke
  Scenario: Booking Cab SUV
    Given User wants to select a car "suv" from uber app
    When The car is selected and pick up is "Guadalajara" and drop is "Merida"
    Then Driver starts journey
    And Driver ends the journey
    Then user pays 1000 MXN
