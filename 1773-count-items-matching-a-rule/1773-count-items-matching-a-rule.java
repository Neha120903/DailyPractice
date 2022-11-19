class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
       for(int i=0;i<items.size();i++)
       {
           if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
               c++;
           if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
               c++;
           if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
               c++;
       }
        return c;
    }
}