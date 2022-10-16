class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num == 0)
            return true;
        for(int i=0; i<num;i++)
        {
            if(i+palindrome(i)== num)
                return true;
        }
        return false;
    
    }
    
    public int palindrome(int i)
    {
        int rev=0;
        while(i>0)
        {
            rev =rev*10 +i%10;
            i=i/10;
        }
        return rev;
    }
}