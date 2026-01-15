class Solution {
    public String capitalizeTitle(String title) {
        char[] charArray = title.toCharArray();
        int len = charArray.length;

        for(int i=0;i<len;i++)
        {
            int firstIndex = i;
            while(i< len && charArray[i]!= ' ')
            {
             charArray[i] = Character.toLowerCase(charArray[i]);
             i++;
            }

            if(i - firstIndex >= 3)
            {
                charArray[firstIndex] = Character.toUpperCase(charArray[firstIndex]);
            }
        }
         return String.valueOf(charArray);
        
    }
}