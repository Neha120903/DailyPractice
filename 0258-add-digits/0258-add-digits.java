class Solution {
    public int addDigits(int num) {
        int s=0;
        while(num>0)
        {
            int r=num%10;
            s+=r;
            num/=10;
        }
        if(s>9)
            return addDigits(s);
        return s;
    }
}