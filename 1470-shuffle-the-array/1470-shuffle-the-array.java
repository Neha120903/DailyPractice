class Solution {
    public int[] shuffle(int[] arr, int n) {
        
      int i=0;
      int j=n;
        int k=0;
        int ans[] = new int[2*n];
        while(i<n && j<2*n)
        {
            ans[k++] = arr[i];
            ans[k++]=arr[j];
            i++;
            j++;
        }
        return ans;
    }
}