# Extract Class

## Problem
You have one class doing work that should be done by two.

## Solution
Create a new class and move the relevant fields and methods from the old class into the new class.

    Person
    ------------------
    name                                Person                                      TelephoneNumber
    officeAreaCode          --->        ------------------                          ------------------ 
    officeNumber                        name                -- officeTelephone ->   areaCode
    ------------------                  ------------------                      1.  number
    getTelephoneNumber                  getTelephoneNumber                          ------------------
                                                                                    getTelephoneNumber    

Page 149 - Martin Fowler's "Refactoring - Improving The Design of Existing Code".