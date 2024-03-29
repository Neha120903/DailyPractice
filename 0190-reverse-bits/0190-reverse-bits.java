public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            ans<<=1;  //right shift ans
            ans=ans|(n&1); //answer updated and shifted
            n>>=1;
        }
        return ans;
    }
}