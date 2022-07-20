class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        HashMap<Character, Queue<String>> map = new HashMap<>();
        int ans =0;
        // map all the character of the super string
        for(int i=0 ;i<S.length();i++)
        {
            map.putIfAbsent(S.charAt(i), new LinkedList<>());
        }
        
        // make a list of all string acc. to their first char and add them to coresponding keys
        for(String word : words)
        {
            char startchar = word.charAt(0);
            if(map.containsKey(startchar))
                map.get(startchar).add(word);
        }
        
        for(int i=0 ;i<S.length(); i++)     //"abcde"
        {
            char startchar = S.charAt(i);    // startchar ="a"  
            Queue<String> q = map.get(startchar);// list = "a" ,"acd", "ace"
            int size = q.size();   //3
            for(int j=0 ;j<size; j++)
            {
                String str = q.poll();          // str = "a"
                if(str.substring(1).length() == 0)   // if string becomes empty increment the answer
                    ans++;
                else
                {
                    // if string is not empty then add that to the new key acc. to its first char
                    if(map.containsKey(str.charAt(1)))
                        map.get(str.charAt(1)).add(str.substring(1));
                 }
            }
        }
        return ans;
    }
}