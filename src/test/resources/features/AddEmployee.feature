Feature: Add Employee

Background:
Given user should be present in Addemployee page

@smoke @regression
Scenario:
 when user enter valid firstname middlename lastname and click on submit
employee should added successfully 

When  user enter valid firstname middlename lastname 
And click on submit button
Then Employee should be added successfully

 @functional
Scenario:
 when user enter invalid firstname middlename lastname and click on submit
employee should not added . 

When  user enter invalid firstname  lastname 
And click on submit button
Then Employee should not be added successfully


@smoke
Scenario Outline: Add multiple employees

Given user should be present in Addemployee page
When  user enter valid "<firstname>" "<middlename>" "<lastname>"
And click on submit button
Then Employee should be added successfully

Examples: 
          |firstname|middlename|lastname|
          |xyz      |xyz12     |xyz123  |



