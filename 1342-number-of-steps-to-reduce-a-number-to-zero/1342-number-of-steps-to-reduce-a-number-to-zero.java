class Solution {
    public int numberOfSteps(int n) {
       return Integer.toBinaryString(n).length()-1+Integer.bitCount(n);
    }
}