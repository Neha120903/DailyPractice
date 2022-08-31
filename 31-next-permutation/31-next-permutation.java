class Solution {
    public void nextPermutation(int[] nums) {
        //find the element which is less then the next value so that we can swap
        //now find the second max element to swap
        //now reverse range by the next of index
        int index =0;
        for(int i=nums.length-2; i>=0;i--)
        {
            if(nums[i] < nums[i+1]){
                index =i;
                break;
            }
        }
        
        int q=0;
        for(int i=nums.length-1; i>index;i--)
        {
            if(nums[i] > nums[index]){
                q =i;
                break;
            }
        }
        
        if(index ==0 && q==0)
        {
             rangereverse(nums,0,nums.length-1);
            return;
          
        }
        int temp = nums[index];     
        nums[index]= nums[q];
        nums[q] = temp;
        rangereverse(nums,index+1, nums.length-1);
    }
        
    public static void rangereverse(int [] arr, int i, int j)
    {
        int start = i;
        int end = j;
        while (start<end)
        {
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
    
    }
}