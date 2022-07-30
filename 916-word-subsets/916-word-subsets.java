class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int bmax[] = count("");
        for(String b :B)
        {
            int bcount[] = count(b);
            for(int i=0; i<26;++i)
                bmax[i] = Math.max(bmax[i], bcount[i]);
        }
        
        List<String> ans = new ArrayList();
        search : for (String a: A)
        {
            int acount[] = count(a);
            for(int i=0; i<26; ++i)
                if(acount[i]<bmax[i])
                    continue search;
            ans.add(a);
        }
        return ans;
    }
    
    public int[] count(String S)
    {
        int ans[] = new int[26];
        for(char c: S.toCharArray())
            ans[c- 'a']++;
        return ans;
    }
}