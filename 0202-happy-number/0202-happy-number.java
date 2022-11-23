class Solution {
    public boolean isHappy(int n) {
        List<Integer> al = new ArrayList<>();
        while(n!=1)
        {
            int t=n;
            n=0;
            while(t>0)
            {
                n=n+(int)Math.pow((t%10),2);
                t=t/10;
            }
            if(al.contains(n))
                return false;
            else
                al.add(n);
        }
        return true;
    }
}