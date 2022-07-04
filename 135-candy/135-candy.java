class Solution {
    private int sum(int n)
    {
        return (n*(n+1)/2);
    }
    
    public int candy(int[] ratings) {
        int candies = 0;
        int up= 0, down =0;
        int prevSlope = 0;
        //Lopping the array
        for(int i=1; i<ratings.length;i++)
        {
            //calculating the slope
            //increasing slope =1 , decreasing slope =-1 , plane =0
            int currSlope = ratings[i]>ratings[i-1]?1 :(ratings[i]<ratings[i-1]?-1 : 0);
            
            //Dividing the  mountains    _
            //3 condition :/\  ||  /_ ||  \
            if((prevSlope<0 && currSlope>=0) || (prevSlope>0 && currSlope ==0))
               {
                   candies = candies + sum(up) + sum(down) + Math.max(up,down);
                   up=0;
                   down=0;
               }
               
              if(currSlope>0) up++;
              else if(currSlope<0) down++;
               else candies++;
               
               prevSlope = currSlope;
        }
        candies = candies+ sum(up) +sum(down) + Math.max(up,down)+1;
        return candies;
    }
}