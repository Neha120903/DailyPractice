class Solution {
    public void rotate(int[] arr, int k) {
         int n = arr.length;
        // 1 - last s k elements ko reverse kre h
        k=k%n;
        rangereverse(arr,n-k,n-1);
        rangereverse(arr,0,n-k-1);
        rangereverse(arr,0,n-1);
    }
    
    
   public static void rangereverse(int [] arr, int i, int j)
    {
        int start = i;
        int end = j;
        while (start<end)
        {
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
    }
}