class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer > map = new HashMap<>();

        for(char a : magazine.toCharArray())
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(char b : ransomNote.toCharArray())
        {
            if(!map.containsKey(b) || map.get(b) ==0)
            {
                return false;
            }
            map.put(b, map.get(b) - 1);
        }
        
        return true;
        
    }
}