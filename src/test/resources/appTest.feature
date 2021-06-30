Feature: test on apk app

  Rule: only test on the app apk

  Background:
    Given start driver app
    Given accept cookie
    Given accept all permission

    Scenario: search item
      Given make a search spotify
      Then click on the suggested item

    Scenario: click on app button
      Then click on app button

    Scenario: print category
      Given make a search spotify
      Then click on the suggested item
      Then print category