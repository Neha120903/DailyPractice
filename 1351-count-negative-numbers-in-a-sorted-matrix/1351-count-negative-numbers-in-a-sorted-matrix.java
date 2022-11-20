class Solution {
    public int countNegatives(int[][] grid) {
        int r=0;
        int c=0;
        int ans=0;
        for(r=0;r<grid.length;r++)
        {
            for(c=0;c<grid[0].length;c++)
            {
                
            
            if(grid[r][c]<0)
            {
                ans+=grid[r].length-c;//since the array is sorted, as soon as first negative is found, remaining can be counted instantly and no need to traverse any more.
                
                break;
            }
        }
        }
        return ans;
    }
}