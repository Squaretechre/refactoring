# Hide Delegate

## Moving Features Between Objects 

### Problem
A client is calling a delegate class of an object.

### Solution
Create methods on the server to hide the delegate.

                ------------                                    ------------
                Client Class                                    Client Class
            ____------------____                    ---->       ------------
           |                    |                                     |
           |                    |                                     |
         --                      --                             ------------
        |                          |                            Person
    -------------             ----------                        ------------
    Person          <-->      Department                        getManager
    -------------             ----------                        ------------
    getDepartment             getManager                              |
                                                                      |
                                                                ------------
                                                                Department
                                                                ------------
    
    
    
     ----------           ----------           ------------
    |  Client  |-------->|  Server  |-------->|  Delegate  |
     ----------           ----------           ------------
                         | method() |
                          ----------
                                     \
                                      \__________________
                                      | delegate.method()
                         
                                                         
Page 157 - Martin Fowler's "Refactoring - Improving The Design of Existing Code".
