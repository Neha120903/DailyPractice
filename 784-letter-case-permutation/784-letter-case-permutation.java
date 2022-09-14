class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        List<String> permutation = letterCasePermutation(s.substring(1));
       for(String p : permutation)
       {
           if(Character.isDigit(s.charAt(0)))
               ans.add(s.charAt(0)+p);
           else{
               ans.add(Character.toLowerCase(s.charAt(0))+p);
               ans.add(Character.toUpperCase(s.charAt(0))+p);
           }
       }
        return ans;
    }
}