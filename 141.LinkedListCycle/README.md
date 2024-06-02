# 141. Linked List Cycle

## Problem Description

Given the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, `pos` is used to denote the index of the node that the tail's next pointer is connected to. Note that `pos` is not passed as a parameter.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

### Example 1

**Input**:
- `head = [3,2,0,-4]`, `pos = 1`

**Output**:
- `true`

**Explanation**:
- There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

## Approach

To detect if a linked list has a cycle, we use Floyd's Cycle-Finding Algorithm, also known as the "Tortoise and Hare" algorithm. This algorithm employs two pointers moving at different speeds to identify a cycle.

### Base Case Check

- If the list is empty (`head == null`) or has only one node (`head.next == null`), it cannot have a cycle, so return `false`.

### Initialize Pointers

- Use two pointers, `slow` and `fast`.
  - The `slow` pointer starts at the head of the list and moves one step at a time.
  - The `fast` pointer starts at the second node of the list and moves two steps at a time.

### Cycle Detection Loop

- Loop until the `slow` pointer meets the `fast` pointer.
  - Inside the loop:
    - If the `fast` pointer reaches the end of the list (`fast == null` or `fast.next == null`), it means there is no cycle, so return `false`.
    - Move the `slow` pointer one step forward.
    - Move the `fast` pointer two steps forward.

### Cycle Detected

- If the `slow` pointer meets the `fast` pointer, it indicates the presence of a cycle, so return `true`.

## Space and Time Complexity

- **Time Complexity**: O(n)
  - Where `n` is the number of nodes in the linked list.
  - The algorithm runs in linear time since both pointers traverse the list at most once.

- **Space Complexity**: O(1)
  - The space complexity is constant because only a few additional pointers are used, regardless of the input size.
