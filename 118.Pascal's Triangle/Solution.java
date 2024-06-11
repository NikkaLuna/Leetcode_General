
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Start with the first string as the initial prefix
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {

            // Update the prefix by comparing it with the current string
            while (strs[i].indexOf(prefix) != 0) {
                
                // Reduce the prefix length by one until it matches the beginning of the current string
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, return ""
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
    }
}


public class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // The first and last elements of each row are always 1
                if (j == 0 || j == i) {
                    row.add(1);

                } else {
                    // For other elements, the value is the sum of the two elements directly above it
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }
}

    
