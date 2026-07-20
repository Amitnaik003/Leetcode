class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums){
            if(h.containsKey(i)){
                return true;
            }else{
                h.put(i,0);
            }
        }
        return false;
    }
}