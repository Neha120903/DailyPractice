class Solution {
    public String toLowerCase(String s) {
        String ans="";
        for(int i=0; i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                ans+=Character.toLowerCase(s.charAt(i));
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}