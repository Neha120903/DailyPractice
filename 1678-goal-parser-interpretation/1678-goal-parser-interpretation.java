class Solution {
    public String interpret(String s) {
        String ans="";
        
        for(int i=0; i<s.length()-1;i++)
        {
            if(s.charAt(i)=='G')
                ans+='G';
            else if(s.charAt(i)=='(' && s.charAt(i+1)==')')
                ans+='o';
            else if(s.charAt(i)=='(' && s.charAt(i+1)=='a')
                ans+="al";
        }
        if(s.charAt(s.length()-1)=='G')
            ans+='G';
        return ans;
    }
}