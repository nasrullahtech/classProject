Feature: Adding a Review

  @smokeTest
  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    Given User is on Retail website
    When User click on Desktops tab
    And User click on Show all desktops
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname | yourReview                                                                                                                          | Rating |
      | Ahmad    | really this camera is really good.I will recommend it goodI will recommend it goodI will recommend it good I will recommend it good | good   |
    And User click on Continue Button
    Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”
