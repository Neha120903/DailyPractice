class Solution {
    public int mostWordsFound(String[] s) {
        int ans=0;
        int max=0;
        for(int i=0; i<s.length;i++)
        {   
            ans=0;
            for(int j=0; j<s[i].length();j++)
            {
                if(s[i].charAt(j) == ' ')
                    ans++;
            }
            if(ans>max)
                max=ans;
        }
        return max+1;
    }
}