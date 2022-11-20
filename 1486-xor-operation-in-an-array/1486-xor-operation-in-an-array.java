class Solution {
    public int xorOperation(int n, int start) {
        int a[]= new int[n];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            a[i]=start+2*i;
            ans^=a[i];
        }
        return ans;
    }
}