Feature: Wellsfargo Bank signon test;
  Scenario: Right Username and password for signon;

  Given User in a home page.
  When User try to sign on  using right username and Password
  Then user able to sign on

#    Given User in a home page
#    When User try to sign on using wrong username and right password
#    Then user unable to sign on

#    Given User in a home page
#    When User try to sign on using right username and wrong password
#    Then user unable to sign on
#
#    Given User in a home page
#    When User try to sign on using wrong username and wrong password
#    Then user unable to sign on
#
#    Given User in a home page
#    When User try to sign on using right username and right password
#    And sign on time out
#    Then user unable to sign on