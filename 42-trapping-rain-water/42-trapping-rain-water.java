class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftHeight = new int[n];
        int[] rightHeight = new int[n];
        leftHeight[0] = height[0];
        rightHeight[n-1] = height[n-1];
        
        for(int i=1;i<n;i++)
        {
            leftHeight[i] = Math.max(leftHeight[i-1],height[i]); 
        }
        
        for(int i=n-2;i>=0;i--)
        {
            rightHeight[i]= Math.max(rightHeight[i+1],height[i]);
        }
        
        int sum =0;
        
        for(int k=0; k<n;k++)
        {
            sum = sum + (Math.min(leftHeight[k], rightHeight[k]) - height[k]);
        }
        return sum;
    }
}