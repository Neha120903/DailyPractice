class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
            return false;
        Set<Character> s= new HashSet<>();
        for(char c: sentence.toCharArray())
            s.add(c);
        return s.size()==26;
    }
}