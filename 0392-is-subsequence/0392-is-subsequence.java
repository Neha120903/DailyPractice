class Solution {
    public boolean isSubsequence(String s, String t) {
        int strt=0;
        int ti=0;
        while(strt<s.length() && ti<t.length()){
            if(s.charAt(strt) == t.charAt(ti)) 
                strt++;
            ti++;
        }
        return strt==s.length();
    }
}