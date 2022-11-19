class Solution {
    public int minimumRecolors(String s, int k) {
        int op=Integer.MAX_VALUE;
        int flip=0;
        int c=0;
        int i=0;
        
        for(int j=0;j<s.length();++j)
        {
            if(s.charAt(j)=='W')
            {
                flip++;
                c++;
            }
            else if(s.charAt(j)=='B')
                c++;
            if(c==k)
            {
                op=Math.min(op,flip);
                if(s.charAt(i)=='W')
                {
                    flip--;
                    c--;
                }
                else
                    c--;
                i++;
            }
        }
        return op;
    }
}