class Solution {
    public int countSubstrings(String s) 
    {
        int res=0;
        for(int i=0; i<s.length(); i++)
        {
            res += countPalindrome(s,i,i);
            res += countPalindrome(s,i,i+1);
        }
        return res;
    }
    
    
    public int countPalindrome(String s, int left, int right)
    {
        int ans=0;
        while(left >=0 && right<s.length() && s.charAt(left) == s.charAt(right))
        {
            ans++;
            left-=1;
            right+=1;
        }
        return ans;
    }
}