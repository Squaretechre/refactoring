# Replace Data Value with Object

## Organizing Data

### Problem
You have a data item that needs additional data or behavior.

### Solution
Turn the data item into an object.

                            ---------------
                            Order
                            ---------------
                            customer:String
                            
                                   |
                                   |
                                  
               ----------                    -----------
               Order        <>------------>  Customer
               ----------                    -----------
                                             name:String

Page 175 - Martin Fowler's "Refactoring - Improving The Design of Existing Code".