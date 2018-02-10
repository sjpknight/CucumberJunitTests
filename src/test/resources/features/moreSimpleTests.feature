Feature: more simple tests

  Scenario: another simple scenario test
    Given a start state
    When the state is changed
    Then I see the state has changed

  Scenario: another scenario with a table
    Given a start state with
    |table|
    |stuff|
    When I do stuff
    Then I see result

  Scenario Outline: another scenario with multiple examples
    Given a start state
    When I do a thing with "parameter"
    Then I see expected result

  Examples:
    |parameter|
    |1        |
    |2        |
    |3        |


