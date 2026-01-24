class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;

        for(int i=0;i<accounts.length;i++){
            int currentSum=0;
            for(int j =0;j <accounts[i].length;j++)
            {
                currentSum = currentSum + accounts[i][j];
            }
            maxwealth = Math.max(currentSum, maxwealth);
        }
        return maxwealth;


        
    }
}