class Solution {
    public boolean reorderedPowerOf2(int n) {
       int [] count = countN(n);
        int nums =1;
        for(int i=0; i<31; i++)
        {
            if(Arrays.equals(count, countN(nums)))
                return true;
            nums=nums<<1;
        }
        return false;
        
    }
    
    public static int[] countN(int n)
    {
        int arr[] = new int[10];
        while(n>0)
        {
            arr[n%10]++;
            n=n/10;
        }
        return arr;
    }
}