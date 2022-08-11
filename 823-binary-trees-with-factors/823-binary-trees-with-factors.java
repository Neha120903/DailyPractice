class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int mod = 1_000_000_007;
        int n = arr.length;
        Arrays.sort(arr);
        long[] dp = new long[n];
        Arrays.fill(dp,1);
        
        Map<Integer, Integer> index = new HashMap();
        for(int i=0; i<n;i++)
            index.put(arr[i],i);
        for(int i=0;i<n;++i)
            for(int j=0; j<i; ++j)
            {
                if(arr[i]%arr[j] ==0)
                {
                    int right = arr[i]/arr[j];
                    if(index.containsKey(right))
                        dp[i] =(dp[i]+dp[j]*dp[index.get(right)])%mod;
                }
            }
        long ans =0;
        for(long x: dp)
            ans += x;
        return (int)(ans%mod);
    }
}