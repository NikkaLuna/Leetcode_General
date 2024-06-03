# 94. Binary Tree Inorder Traversal

## Problem Statement
Given the root of a binary tree, you need to return the inorder traversal of its nodes' values.

Inorder traversal is a specific way to traverse a binary tree where you visit the left subtree first, then the root node, and finally the right subtree.

### Example 1:
- **Input**: `root = [1, null, 2, 3]`
- **Output**: `[1, 3, 2]`

### Example 2:
- **Input**: `root = []`
- **Output**: `[]`

### Example 3:
- **Input**: `root = [1]`
- **Output**: `[1]`

## Approach
To solve this problem, we use a recursive approach for the inorder traversal. The steps involved are:

1. **Define a Helper Function**: Create a helper function that takes a node and a list as parameters. This function will perform the recursive traversal.
2. **Base Case**: In the helper function, if the current node is null, return immediately.
3. **Recursive Traversal**:
   - First, recursively traverse the left subtree.
   - Then, visit the current node by adding its value to the result list.
   - Finally, recursively traverse the right subtree.
4. **Initiate Traversal**: Call the helper function from the main function, passing the root of the tree and an empty list to store the result.
5. **Return Result**: After the traversal is complete, return the result list containing the inorder traversal of the binary tree.

## Space and Time Complexity
- **Time Complexity**: The time complexity of the recursive inorder traversal is \(O(n)\), where \(n\) is the number of nodes in the binary tree. This is because each node is visited exactly once.

- **Space Complexity**: The space complexity depends on the depth of the recursion stack. In the worst case, the space complexity is \(O(h)\), where \(h\) is the height of the tree. In the average case for a balanced tree, the space complexity will be \(O(\log n)\), but in the worst case for a skewed tree, it could be \(O(n)\).
