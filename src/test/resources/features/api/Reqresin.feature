@reqresin
  Feature: Reqresin

    @Post-login @Positive
    Scenario: Success POST login
      When user send POST login request to reqresin
      Then response status code should be 200
      And response structure should match json schema "login.json"

    @Post-Regiter @Negative
    Scenario: Success POST Register
      When user send POST register request to reqresin
      Then response status code should be 200
      And response structure should match json schema "register.json"


    @Post-login @Negative
    Scenario: Failed POST Login
      When user send POST login request to reqresin and faild email
      Then response status code should be 400
      And response structure should match json schema "unsuccess-login.json"

