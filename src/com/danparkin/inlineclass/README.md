# Inline Class

## Moving Features Between Objects 

### Problem
A class isn't doing very much.

### Solution
Move all its features into another class and delete it.

    Person                                      TelephoneNumber                 Person
    ------------------                          ------------------              ------------------
    name                -- officeTelephone ->   areaCode                ---->   name
    ------------------                          number                          areaCode
    getTelephoneNumber                          ------------------              number
                                                getTelephoneNumber              ------------------
                                                                                getTelephoneNumber

Page 154 - Martin Fowler's "Refactoring - Improving The Design of Existing Code".
