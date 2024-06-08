class Solution {

    public int[] replaceElements(int[] arr) {
        
    int n = arr.length;
    int maxElement = -1;  // Initialize maxElement as -1 since the last element should be replaced with -1

    // Traverse the array backwards
    for (int i = n - 1; i >= 0; i--) {

        int current = arr[i];  // Store the current element
        arr[i] = maxElement;    // Replace the current element with the max element found so far
        maxElement = Math.max(current, maxElement);  // Update maxElement
    }

    return arr;
  }
}
