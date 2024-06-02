# 21. Merging Two Sorted Linked Lists

## Problem Description

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

### Example 1

**Input**:
- `list1`: [1, 2, 4]
- `list2`: [1, 3, 4]

**Output**:
- [1, 1, 2, 3, 4, 4]

## Approach

To merge the two sorted linked lists into one sorted list, we use a two-pointer technique with a dummy node. Here's the step-by-step approach:

1. **Initialize Dummy Node**: Create a dummy node to act as the starting point of the merged list. This helps simplify edge cases.
2. **Set Current Pointer**: Use a pointer `current` to build the new list by attaching nodes to it.
3. **Iterate through Both Lists**: Use a while loop to iterate through both lists as long as neither is exhausted.
   - Compare the current nodes of `list1` and `list2`.
   - Attach the smaller node to the merged list and move the pointer of that list to the next node.
   - Move the `current` pointer to the next node in the merged list.
4. **Attach Remaining Nodes**: After the loop, if there are remaining nodes in either list, attach them to the merged list.
5. **Return the Merged List**: Return the merged list starting from the node after the dummy.

## Space and Time Complexity

- **Time Complexity**: O(n + m)
  - Where `n` is the number of nodes in `list1` and `m` is the number of nodes in `list2`.
  - We traverse each list once, making the time complexity linear in terms of the total number of nodes.

- **Space Complexity**: O(1)
  - The space complexity is constant because we are only using a few pointers and not allocating any additional space proportional to the input size.
