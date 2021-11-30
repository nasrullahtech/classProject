Feature: Editing the affiliate info

  @editAffiliateTest
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    Given User is on Retail website
    When User clicks on  Affiliate Account link
    And User enters email 'alexjones3232@gmail.com'
    And User enters password 'Tek@2021'
    And User clicks on login
    And User clicks on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName     | abaNumber | swiftCode | accountName | accountNumber |
      | Credit Union |   7654321 |     98765 | Saving      |    9161289876 |
    And User click on Continue button
    Then User should see a success message
