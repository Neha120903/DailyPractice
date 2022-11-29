class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        findPermut(0,nums,ans);
        return ans;
    }
    
    public void findPermut(int indx, int[]nums,List<List<Integer>> ans)
    {
        if(indx==nums.length)
        {
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
                res.add(nums[i]);
            ans.add(new ArrayList<>(res));
            return;
        }
        
        for(int i=indx;i<nums.length;i++)
        {
            swap(nums,i,indx);
            findPermut(indx+1,nums,ans);
            swap(nums,i,indx);
        }
    }
    
    public void swap(int[]arr, int i, int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}