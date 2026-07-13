class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            // Compare this character with others
            for (int j = 1; j < strs.length; j++) {
                // If index exceeds length or mismatch found
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first; // whole string is common prefix
    }
}
