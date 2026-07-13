class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        if(nums.length < 3){
            return false;
        }
        int i;
        pre[0] = nums[0];
        for(i = 1; i <= nums.length-1; i++){
            pre[i] = Math.min(nums[i],pre[i-1]);
        }
        suf[nums.length-1] = nums[nums.length-1];
        for(i = nums.length-2; i>=0; i--){
            suf[i] = Math.max(nums[i],suf[i+1]);
        }
        for(i = 1; i <= nums.length-2; i++){
            if(pre[i-1] < nums[i] && nums[i] < suf[i+1]){
                return true;
            }
        }
        return false;
    }
}