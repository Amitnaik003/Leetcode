class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        int [] fre= new int[n+1];

        for(int i =0;i<n;i++){
          if( fre[nums[i]]==0) fre[nums[i]]++;
            else  return nums[i];
        }
        return 0;
    }
}