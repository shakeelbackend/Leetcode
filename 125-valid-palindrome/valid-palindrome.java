class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char i: charArray)
        {
            if(Character.isLetter(i) || Character.isDigit(i))
            {
                sb.append(Character.toLowerCase(i));
            }
        }
        String temp = sb.toString();
        int left =0 ; 
        int right = temp.length()-1;
        while(left<=right)
        {
            if(temp.charAt(left) != temp.charAt(right))
             {
                return false;
             }
        left++;
        right--;

        }
        

         return true;
    }
   
}