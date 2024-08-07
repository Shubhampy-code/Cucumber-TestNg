@tag
Feature: Second openion

  @tag1
  Scenario: To validate the second openion functionality 
    Given Open browser, enter sparsh hospital url
    And select the Yashwantpur hospital from hospital dropdown
    When User select on second openion link
    And user enter the firstname,lastname, phone, email textbox
    And upload the report
    Then Thankyou message should be displayed
    And bank info should be available in the page.

#  @tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

#    Examples: 
 #     | name  | value | status  |
  #    | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
