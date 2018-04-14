# Replace Temp with Query

## Composing Methods

### Problem
You are using a temporary variable to hold the result of an expression.

### Solution
Extract the expression into a method. Replace all references to the temp with the expression. The new method can then be used in other methods.

Page 120 - Martin Fowler's "Refactoring - Improving The Design of Existing Code".