class Solution {
    public int findDuplicate(int[] nums) {
         HashMap<Integer,Integer> h = new HashMap<>();
        for(Integer i:nums){
            if(h.containsKey(i)) return i;
            else h.put(i,0);
        }
        return 0;
    }
}