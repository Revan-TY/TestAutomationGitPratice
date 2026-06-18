Feature: eadd employee

Scenario Outline: add employee using excel

Given add employee page
When user enter  firstname middlename lastname <row>
And click on submit buttonn
Then Employee should be added

Examples: 
          |row|
          |0|             
          |1|
          
