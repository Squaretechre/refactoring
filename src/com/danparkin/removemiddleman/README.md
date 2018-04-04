# Remove Middle Man

## Moving Features Between Objects 

### Problem
A class is doing too much simple delegation.

### Solution
Get the client to call the delegate directly.

    ------------                        ------------
    Client Class                        Client Class
    ------------                    ____------------____
         |                         |                    |
         |                         |                    |
    ------------    ---->        --                      -- 
    Person                      |                          |
    ------------            -------------             ----------
    getManager              Person           <-->     Department
    ------------            -------------             ----------
         |                  getDepartment             getManager
         |
    ------------
    Department
    ------------                
                                                         
Page 160 - Martin Fowler's "Refactoring - Improving The Design of Existing Code".
