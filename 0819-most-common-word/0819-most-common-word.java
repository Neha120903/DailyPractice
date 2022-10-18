class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> banned_words = new HashSet<>();
        HashMap<String, Integer> count_word= new HashMap<>();
        
        for(String i: banned)
            banned_words.add(i);
        
        String[] words = paragraph.toLowerCase().split("\\W+");
        
        for(String word: words)
            if(!banned_words.contains(word))
                count_word.put(word,count_word.getOrDefault(word,0)+1 );
        int max=0;
        String ans="";
        for(String word: count_word.keySet()){
            if( count_word.get(word) > max){
                max=count_word.get(word);
                ans=word;
            }
        }
        return ans;
    }
}