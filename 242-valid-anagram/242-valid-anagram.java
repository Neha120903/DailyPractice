class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int alphabet[] = new int[26];
        for(int i=0; i<s.length();i++)
            alphabet[s.charAt(i) -'a']++;
        for(int k=0; k<t.length(); k++)
            alphabet[t.charAt(k) -'a']--;
        
        for(int j: alphabet)
            if(j!=0)
                return false;
        
        return true;
        
    }
}