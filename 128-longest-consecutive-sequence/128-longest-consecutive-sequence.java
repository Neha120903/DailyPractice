class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int num: nums)
            numsSet.add(num);
        
        int longestStreak =0;
        for(int num : nums)
        {
            if(!numsSet.contains(num-1))  // want to get the minimal number
            {
                int currentNum = num;
                int currentStreak =1;
                
                while(numsSet.contains(currentNum+1))
                {
                    currentNum+=1;
                    currentStreak+=1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);// get the maximum streak out of all
            }
        }
        return longestStreak;
    }
}