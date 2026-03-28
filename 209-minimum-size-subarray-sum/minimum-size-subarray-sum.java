class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minsum =Integer.MAX_VALUE;
        int sum =0;
        int left = 0;
        for(int right=0; right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                minsum= Math.min(minsum,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minsum ==Integer.MAX_VALUE ? 0: minsum;
    }
}