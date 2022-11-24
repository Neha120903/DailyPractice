class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end= s.length()-1;
        char[] ch= s.toCharArray();
        while(start<end){
            while(start<s.length() && !isVowel(ch[start])){
                start++;
            }
            while(end>=0 && !isVowel(ch[end])){
                end--;
            }
            if(start<end){
                swap(ch,start++,end--);
            }
        }
        return new String(ch);
    }
    void swap(char[] chars, int x, int y){
        char temp= chars[x];
        chars[x]= chars[y];
        chars[y]= temp;
    }
    
    boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}