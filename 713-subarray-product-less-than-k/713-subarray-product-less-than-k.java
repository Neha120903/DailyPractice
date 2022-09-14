class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return NoOfSubArray(nums,k);
    }
     public static int NoOfSubArray(int[]arr, int k)
    {
        int ans=0;
        int strt =0;
        int end=0;
        int p=1;
        while(end <arr.length)
        {
            //grow window
            p *= arr[end];



            //window shrink kro
            while( p >=k && strt <=end)
            {
                p = p/arr[strt];
                strt++;
            }

            //ans calculate kro
            ans = ans+ (end-strt +1);
            end++;
        }
        return ans;
    }
}
