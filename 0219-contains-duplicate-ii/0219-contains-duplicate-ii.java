class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>k)
                s.remove(nums[i-k-1]);//remove element if its distance to nums[i] is not lesser than k
            if(!s.add(nums[i]))//because all still existed elements is closer than k distance to the num[i], therefore if the add() return false, it means there's a same value element already existed within the distance k, therefore return true.
                return true;
        }
        return false;
    }
}