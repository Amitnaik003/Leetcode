class Solution {
    public boolean isSubsequence(String s, String t) {
        // Base case: an empty string is always a subsequence
        if (s.length() == 0) {
            return true;
        }

        char[] x = s.toCharArray();
        int j = 0; // Fixed: Declared and initialized j

        for (char i : t.toCharArray()) {
            if (i == x[j]) {
                j = j + 1;
            }
            
            // Fixed: Check if we matched all characters early to exit loop
            if (j == s.length()) {
                return true;
            }
        }

        return j == s.length();
    }
}
