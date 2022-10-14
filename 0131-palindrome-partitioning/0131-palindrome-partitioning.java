class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp= new ArrayList<>();
         partition(s,0,temp,res);
        return res;
    }
    
    public void partition(String s, int index,List<String> temp,List<List<String>> res )
    {
        if(index == s.length())
        {
            res.add(new ArrayList<String>(temp));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(checkPalindrome(s,index,i))
            {
                temp.add(s.substring(index,i+1));
                partition(s,i+1,temp,res);
                temp.remove(temp.size()-1);
            }
            
        }
    }
    
    public boolean checkPalindrome(String s, int strt, int end)
    {
        while(strt <= end)
        {
            if(s.charAt(strt++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}
