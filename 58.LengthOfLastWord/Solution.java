class Solution {

    public int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Start from the end of the string, skip trailing spaces, and count the length of the last word
        while (i >= 0) {

            if (s.charAt(i) != ' ') {
                length++;

            } else if (length > 0) {
                // Break the loop if we have already started counting the length of the last word
                break;
            }
            i--;
        }

        return length;
    }
}