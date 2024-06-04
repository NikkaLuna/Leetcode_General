# 226. Invert Binary Tree

## Problem Statement
Given the root of a binary tree, invert the tree, and return its root. Inverting a binary tree means swapping the left and right children of all nodes in the tree.

## Example 1

**Input:**
root = [4, 2, 7, 1, 3, 6, 9]

**Output:**
[4, 7, 2, 9, 6, 3, 1]

## Approach
To solve this problem, we use a recursive approach to invert the binary tree. The steps involved are:

1. **Base Case**: If the current node is `null`, return `null`.
2. **Recursive Case**:
   - Recursively invert the left subtree and store the result in a temporary variable `left`.
   - Recursively invert the right subtree and store the result in a temporary variable `right`.
   - Swap the left and right children of the current node.
3. **Return the Current Node**: After swapping, return the current node which now has its left and right subtrees inverted.

## Space and Time Complexity

- **Time Complexity**: The time complexity of the recursive inversion is (O(n)), where (n) is the number of nodes in the binary tree. This is because each node is visited exactly once during the traversal.
- **Space Complexity**: The space complexity depends on the depth of the recursion stack. In the worst case, the space complexity is (O(h)), where (h) is the height of the tree. For a balanced tree, the space complexity will be (O(log) n), but in the worst case for a skewed tree, it could be (O(n)).
