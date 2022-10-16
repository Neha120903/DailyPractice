class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length;i++)
        {
            hs.add(nums[i]);
            hs.add(reverse(nums[i]));
        }
        return hs.size();
    }
    
    public int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev= rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
}