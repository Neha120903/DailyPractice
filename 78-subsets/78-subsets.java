class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       generateSubsets(nums,0,new ArrayList<Integer>() , ans);
        return ans;
        
    }
    
    public void generateSubsets(int[] nums, int indx, List<Integer> current, List<List<Integer>> ans)
    {
         ans.add(new ArrayList<>(current));
        
        for(int i=indx; i <nums.length;i++)
        {
            current.add(nums[i]);
            generateSubsets(nums,i+1,current,ans);
            current.remove(current.size()-1);
        }
        
    }
}