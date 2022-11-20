class Solution {
    public int minimumSum(int num) {
        int d[]= new int[4];
        int i=0;
        while(num>0)
        {
            d[i++]=num%10;
            num/=10;
            
        }
        Arrays.sort(d);
        int sum1=d[0]*10+d[2];
        int sum2=d[1]*10+d[3];
        return sum1+sum2;
    }
}