class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
        for(int fac:new int[] {2,3,5})
            n=keep(n,fac);
        return n==1;
    }
    public int keep(int dividend, int divisor){
        while(dividend%divisor==0)
            dividend/=divisor;
        return dividend;
    }
}