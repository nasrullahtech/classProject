#Feature: Adding an affiliate user
#
  #@affiliateTest
  #Scenario: Register as an Affiliate user with Cheque Payment Method
    #Given User is on Retail website
    #When User click on ‘Register for an Affiliate Account’ link
    #And User sees the affiliate account page
    #And User clicks on Continue button under New Affiliate
    #And User fill affiliate form with below information
      #| firstName | lastName | email                   | telephone | company | website          | taxID | paymentMethod | payeeName | password | passwordConfirm |
      #| Alex      | Jone     | alexjones8239@gmail.com | 983982938 | Private | www.testingg.com | 12345 | cheque        | Alex      | Tek@2021 | Tek@2021        |
    #And User selects cheque as the paymnet method
    #And User enters name
    #And User enters password
    #And User confirms password
    #And User check on About us check box
    #And User click on Continue button
    #Then User should see a success message
