# 98. Validate Binary Search Tree

## Problem Statement
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.

## Example 1

**Input:**
root = [2, 1, 3]

**Output:**
true

## Approach
To determine if a binary tree is a valid BST, we use a recursive approach that ensures each node meets the BST properties. The key idea is to pass down the allowable range of values for each node and validate that each node's value falls within the correct range.

### Steps:
1. **Define a Helper Function**: Create a helper function that takes a node and the allowable range (`min`, `max`) as parameters.
2. **Base Case**: If the current node is `null`, return `true` since an empty tree is a valid BST.
3. **Validation**: Check if the current node's value is within the allowable range (`min < node.val < max`). If not, return `false`.
4. **Recursive Check**:
   - Recursively validate the left subtree with an updated maximum value (`node.val`).
   - Recursively validate the right subtree with an updated minimum value (`node.val`).
5. **Return the Result**: The tree is a valid BST only if both subtrees are valid BSTs.

## Space and Time Complexity

- **Time Complexity**: The time complexity of the recursive validation is (O(n)), where (n) is the number of nodes in the binary tree. This is because each node is visited exactly once.
- **Space Complexity**: The space complexity depends on the depth of the recursion stack. In the worst case, the space complexity is (O(h)), where (h) is the height of the tree. For a balanced tree, the space complexity will be (O(log n)), but in the worst case for a skewed tree, it could be (O(n)).


