class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
         if(n==0)
        {
            return new int[0];
        }

        int[] result = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int product=1;
        for(int i=0;i<n;i++)
        {
            product = product*nums[i];
            prefix[i] = product;
        }
        product =1;
        for(int i=n-1;i>0;i--)
        {
            product = product*nums[i];
            suffix[i] = product;
        }
        result[0]= suffix[1];
        result[n-1] = prefix[n-2]; 
        
        for(int i=1;i<n-1;i++)
        {
            result[i] = prefix[i-1] * suffix[i+1];
        }

     return result;
    }
    
}