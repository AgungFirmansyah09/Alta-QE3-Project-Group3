@reqresin-UpdateAndDelete
Feature: User

  @put-updateData @positive
  Scenario: User PUT Update data
    When user successful send Put update data request in reqresin
    Then respone status code should be 200
    And respone structure sould match json scema "updateData.json"

  @delete-account @positive
  Scenario: User DELET Account
   When user successful send Delete accont request in reqresin
   Then respone status code should be 204
