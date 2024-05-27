Feature: Adding stakeholder

  @test
  Scenario: Verify that stakeholder is saved successfully
    Given Signin form is displayed
    When enter username and password
    And Click on the Signin button
    Then Admin dashboard is displayed
    And Click on the Admin
    Then Check that Stakeholder management option is available
    When Click on the Stakeholder Management
    Then check that Stakeholder info is displayed
    When Click on the Stakeholder info
    And Click on the plus button
    And Select working area to tarma
    And Click on the next button
    And enter stakeholder name
    And Select gender and stakeholder type
    And enter mobile no
    And select designation and disability
    And Click on the Save button




