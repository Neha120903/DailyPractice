class Solution {
    public String truncateSentence(String s, int k) {
        String ans="";
        for(int i=0; i<s.length();i++)
        {
            while(i<s.length() && s.charAt(i)!=' ')
            {
                ans+=s.charAt(i);
                i++;
            }  
            k--;
            if(k>0)ans+=' ';
            if(k==0)
                return ans;
        }
        return ans;
    }
}