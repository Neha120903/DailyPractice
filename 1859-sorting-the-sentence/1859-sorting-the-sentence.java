class Solution {
    public String sortSentence(String s) {
       String [] str = s.split(" ");
        String [] ans = new String[str.length];
        for(String word: str)
        {
            int i=word.charAt(word.length()-1)-'0';
            ans[i-1]=word.substring(0,word.length()-1);
        }
        /*
        String res="";
        for(int i=0;i<ans.length-1;i++)
            res=res+ans[i]+" ";//this operation taken O(N) time so hence we can optimize it by                                       using string builder
        res=res+ans[ans.length-1];
       return res;
        */
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ans.length-1;i++)
            sb.append(ans[i]).append(" ");
        
        sb.append(ans[ans.length-1]);
        return sb.toString();
            
        
    }
}