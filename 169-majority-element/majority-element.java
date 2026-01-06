class Solution {
    public int majorityElement(int[] nums) {
        int count =0; //1,0
        int major =0; //3,

        for(int num: nums)
        {
            if(count==0)
            {
                major = num;
            }
            if(num == major)
            {
                count++;
            }
            else{
                count--;
            }
        }
        return major;
        
    }
}