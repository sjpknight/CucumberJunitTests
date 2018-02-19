Feature: simple tests

  as an automation developer
  I want to express my tests as features and scenarios
  so that I can carry out BDD style development

  Scenario: simple scenario test
    Given a start state
    When the state is changed
    Then I see the state has changed

  Scenario: a scenario with a table test
    Given a start state with
    |table|
    |stuff|
    And some other things going on
    When I do stuff
    Then I see result


  Scenario Outline: a scenario with multiple examples
    Given a start state
    When I do a thing with "<parameter>"
    Then I see expected result

  Examples:
    |parameter|
    |1        |
    |2        |
    |3        |


