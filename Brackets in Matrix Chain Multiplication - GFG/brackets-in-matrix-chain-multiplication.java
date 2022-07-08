// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int p[] = new int[n];
            for(int i = 0;i < n;i++)
                p[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixChainOrder(p, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public static class pair
    {
        String SA;
        int val;
        pair(String SA, int val)
        {
            this.SA =SA;
            this.val = val;
        }
    }
    
    public static pair partitions(int[]arr, int i, int j, pair[][]dp)
    {
        if(i==j) return dp[i][j] = new pair(""+(char)(i-1+'A'),0);
        
        if(dp[i][j]!=null) return dp[i][j];
        int min = Integer.MAX_VALUE;
        String ans ="";
        for(int k=i; k<j;k++)
        {
            pair pair1 = partitions(arr,i,k,dp);
            pair pair2 = partitions(arr,k+1,j,dp);
            int temp = arr[i-1]*arr[k]*arr[j] +pair1.val+pair2.val;
            
            if(temp<=min)
            {
                min = temp;
                ans = pair1.SA+ pair2.SA;
            }
        }
        dp[i][j] = new pair('('+ans+')', min);
        return new pair('('+ans+')', min);
    }
    
    
    static String matrixChainOrder(int arr[], int n){
        // code here
        pair[][] dp = new pair[n+1][n+1];
        return partitions(arr, 1, n-1, dp) .SA;
    }
}