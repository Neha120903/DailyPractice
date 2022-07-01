class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count=0;
        int i=0, j=nums.length-1;
        while(i<nums.length-1 && j>i) {
            if(nums[i]==nums[j])
                count++;
            if(j!=i+1)
                j--;
            else {
                i++;
                j=nums.length-1;
            }
        }
        return count; 
    }
}