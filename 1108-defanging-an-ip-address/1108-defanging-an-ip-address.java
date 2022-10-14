class Solution {
    public String defangIPaddr(String s) {
        String ans="";
        for(int i=0; i<s.length();i++)
        {
           while(i!=s.length() && s.charAt(i) != '.')
           {
               ans=ans+s.charAt(i);
               i++;
           }
           if(i!=s.length() && s.charAt(i) == '.')
           {
               ans=ans+'['+'.'+']';
           }
        }
        return ans;
    }
}