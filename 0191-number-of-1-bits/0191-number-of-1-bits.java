public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c=0;
        int mask=1;
        for(int i=0;i<32;i++)
        {
            if((mask & n)!=0)
                c++;
            mask<<=1;//left shift
        }
        return c;
    }
}