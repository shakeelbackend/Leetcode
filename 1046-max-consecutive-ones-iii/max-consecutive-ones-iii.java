class Solution {
    public int longestOnes(int[] nums, int k) {
        int n= nums.length;
        int maxlength=0;
        

        for(int l=0;l<n;l++)
        {
            int count =0;
            for(int r=l;r<n;r++)
            {
                if(nums[r]==0)
                {
                    count++;
                }
                if(count>k)
                {
                    break;
                }
                maxlength=Math.max(maxlength,r-l+1);
            }

        }
        return maxlength;
    }
}