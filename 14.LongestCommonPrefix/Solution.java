
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