class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum=0;
        for(int i=0;i<k;i++)
        {
            windowSum+=nums[i];
        }
        int maxAvg=windowSum;
        for(int j=k;j<nums.length;j++)
        {
            windowSum +=nums[j];
            windowSum -=nums[j-k];
            maxAvg= Math.max(maxAvg,windowSum);
        }
        return(double) maxAvg/k;
    }
}