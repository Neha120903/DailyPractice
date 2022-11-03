class Solution {
    public String convert(String s, int r) {
        if(r==1) return s;
       String ans="";
        
        for(int i=0; i<r;i++)
        {
            int increment = 2*(r-1);
            
            for(int j=i; j<s.length();j+=increment)
            {
                ans += s.charAt(j);
                
                if(i>0 && i<r-1 && j+increment-2*i<s.length() )
                    ans+= s.charAt(j+increment-2*i);
            }
        }
        return ans;
        
    }
    
    
}