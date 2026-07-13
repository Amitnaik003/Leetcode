class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []pre = new int[nums.length];
        int []suf = new int[nums.length];
        int i;
        int prod = 1;
        for(i = 0; i <= nums.length-1; i++){
            prod = prod * nums[i];
            pre[i] = prod;
        }
        prod = 1;
        for(i = nums.length-1; i >= 0 ; i--){
            prod = prod * nums[i];
            suf[i] = prod;
        }
        if(nums.length == 2){
            nums[0] = suf[1];
            nums[1] = pre[0];
            return nums;
        }
        nums[0] = suf[1];
        nums[nums.length-1] = pre[nums.length-1-1];
        for(i = 1; i <= nums.length-2; i++){
           nums[i] = pre[i-1] * suf[i+1];
        }
        return nums;
    }
}