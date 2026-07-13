class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int []ans = new int[2];
        int i = 0;
        for(Integer x:nums){
            if(h.containsKey(target-x)){
                ans[0] = h.get(target - x);
                ans[1] = i;
            }
            else{
                h.put(x,i);
            }
            i++;
        }
        return ans;
    }
}