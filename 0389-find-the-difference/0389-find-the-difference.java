class Solution {
    public char findTheDifference(String s, String t) {
        String m=s+t;
        char c=0;
        for(int i=0;i<m.length();i++)
        {
            c^=m.charAt(i);
        }
        return c;
    }
}