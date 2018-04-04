# Replace Method with Method Object

## Composing Methods

### Problem
You have a long method that uses local variables in such a way that you cannot apply Extract Method.

### Solution
Turn the method into its own object so that all the local variables become fields on that object. You can then decompose the method into other methods on the same object.

Page 135 - Martin Fowler's "Refactoring - Improving The Design of Existing Code".