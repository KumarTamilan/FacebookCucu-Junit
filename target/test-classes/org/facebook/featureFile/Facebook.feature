Feature: Validate The Facebook Application

  @Smoke1 @Smoke2 @Smoke3 @Smoke4 @Smoke5 @Smoke6
  Scenario: User Handle The LogIn Functionality
    Given user Launch The Facebook Url
    When user Enter The Email In The Email Field
    Then user Enter The Password In The Password Field And Naviget To Forgot Password Field

  @Smoke1 @Smoke2 @Smoke3 @Smoke4 @Smoke5
  Scenario: User Handle The Forgot Password Field
    When user Click The Forgot Password Button
    And user Second Time Enter The Email In Email Field
    And user Second Time Enter The Password In Password Field
    And user Third Time Enter The Email In Email Field
    Then user Click The Facebook Link And Navigate To Create Account Field

  @Smoke1 @Smoke2 @Smoke3 @Smoke4
  Scenario: User Handle The Create New Accout Field
    When user Click The CreateNewAccount Button Then Open The Another One New Window
    And user Handle The New Window Using List Concept
    And user Enter The FirstName In FirstName Field
    Then user Enter The LastName In LastName Field Then Navigate To Date Of Birth DropDown

  @Smoke1 @Smoke2 @Smoke3
  Scenario: User Handle The Date Of Birth DropDown
    When user Select The Day In The Day DropDown
    And user Select The Month In The Month DropDown
    Then user Select The Year In The Year DropDown Then Navigate To Gender Field

  @Smoke1 @Smoke2
  Scenario: User Handle The Gender Field
    When user Click The Custom Gender
    And user Select The Pronoun DropDown
    And user Enter The Gender Details In Gender Text Field
    And user Enter The Mobile Number In Mobile Number Field
    Then user Enter The New Password In New Password Field Then Navigate To Already Have Account Field

  @Smoke1
  Scenario: User Handle The Already Have Account Field
    When user Click The Already Have Account Button
    And user Fourth Time Enter The Email In Email Field
    And user Third Time Enter The Password In Password Field
    And user Click The SignUp Button
    And user Close The Current Browser Window Only
    Then user Handle The Window And Switch To First Window
