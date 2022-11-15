class Solution {
    public int countGoodSubstrings(String s) {
       int strt=0;
        int prev=strt+1;
        int end=prev+1;
        int c=0;
        int ans=0;
        while(end<s.length())
        {
            if(s.charAt(strt)!=s.charAt(prev)                                  &&s.charAt(strt)!=s.charAt(end) && s.charAt(prev)!=s.charAt(end))
           ans+=1;
            strt++;
            prev++;
            end++;
        }
        return ans;
    }
}