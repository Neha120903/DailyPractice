import java.util.Map.Entry;
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int c =0;
        Arrays.sort(nums);
       for(int i=0 ;i<nums.length;i++)
       {
           for(int j=i+1; j<nums.length; j++)
           {
               
                   if(nums[i] == nums[j]){
                       nums[i] = -1;
                       nums[j] = -1;
                       c++;
                       break;
                   }
                        
            }
       }
        Arrays.sort(nums);
        int s=0;
       for(int i=0 ;i<nums.length;i++)
           if(nums[i]>=0)
               s++;
        if(nums.length<2){
        s =1;
    }

        int ans[] = new int[2];
        ans[0] = c;
        ans[1] = s;
        return ans;
    }
    
   
}