class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> res= new ArrayList<>();
        findSubset(0,nums,ans,res);
        return ans;
    }
    
    public void findSubset(int indx, int[]nums,List<List<Integer>> ans,ArrayList<Integer> res )
    {
        ans.add(new ArrayList<>(res));
        
        for(int i=indx;i<nums.length;i++)
        {
            if(i>indx && nums[i] == nums[i-1])
                continue;
            res.add(nums[i]);
            findSubset(i+1,nums,ans,res);
            res.remove(res.size()-1);
        }
    }
}