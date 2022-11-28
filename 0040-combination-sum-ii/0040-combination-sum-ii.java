class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // same as coin change problem but with limited coin
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        Combination(0,candidates,target,ans,new ArrayList<>());
        return ans;
            
        
    }
    public static void Combination(int indx,int[]arr, int target, List<List<Integer>> ans,ArrayList<Integer> res)
    {
            if(target==0)
            {
                ans.add(new ArrayList<>(res));
                return;
            }
        
        for(int i=indx;i<arr.length;i++)
        {
            if(i>indx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            
            res.add(arr[i]);
            Combination(i+1,arr,target-arr[i],ans,res);
            res.remove(res.size()-1);
        }
    }
}