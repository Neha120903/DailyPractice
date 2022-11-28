class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,ans,target,new ArrayList<>());
        return ans;
    }
    
    public void findCombinations(int indx, int[]arr, List<List<Integer>> ans, int target, List<Integer> res)
    {
        if(indx==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        
        if(arr[indx] <= target)
        {
            res.add(arr[indx]);
            findCombinations(indx,arr,ans,target-arr[indx],res);
            res.remove(res.size()-1);
        }
        findCombinations(indx+1,arr,ans,target,res);
    }
}