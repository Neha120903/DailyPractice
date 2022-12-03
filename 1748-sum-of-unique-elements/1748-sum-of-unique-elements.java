class Solution {
    public int sumOfUnique(int[] nums) {
       int sum=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i: nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
            if(mp.get(i)==1)
                sum+=i;
            else if(mp.get(i)==2)
                sum-=i;
        }
        return sum;
    }
}