Feature: Making Api calls for Pet store

  @postRequest
  Scenario: Making the POST request for pet store
    Given the user enters the end point url
    When the user sends the POST request
    Then the response is received