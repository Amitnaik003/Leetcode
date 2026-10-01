class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
           HashMap<Character, Integer> lastSeen = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);

            if(lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= left){
                left = lastSeen.get(currentChar) + 1;
                }

            lastSeen.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }
     

        return maxLength;
    }
}