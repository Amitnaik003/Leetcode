class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h = new HashMap<>();
        int i;
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        if (s.length() != t.length()) {
            return false;
        }
        for(i = 0; i <= s1.length-1; i++){
            if(h.containsKey(s1[i]) && h.get(s1[i]) != t1[i]){
                return false;
            }
            else if(!h.containsKey(s1[i]) && h.containsValue(t1[i])){
                return false;
            }
            else{
                h.put(s1[i],t1[i]);
            }
        } 
        return true;
    }
}