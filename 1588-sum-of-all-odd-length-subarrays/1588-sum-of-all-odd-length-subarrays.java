class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<arr.length;++i)
        {
            int l=i,r=n-i-1;
            ans+=arr[i]*(l/2+1)*(r/2+1);
            ans+=arr[i]*((l+1)/2)*((r+1)/2);
        }
        return ans;
    }
}