class Solution {
    public int maximumWealth(int[][] account) {
        int sum=0;
        int max=0;
        
        for(int i=0;i<account.length;i++)
        {
            sum=0;
            for(int j=0;j<account[0].length;j++)
            {
                sum=sum+account[i][j];
                
            }
            if(sum>max)
            {
               
                max=sum;
                
            }
        }
        return max;
    }
}