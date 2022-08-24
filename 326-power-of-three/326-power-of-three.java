class Solution {
    public boolean isPowerOfThree(int n) {
      //  return (Math.log10(n) / Math.log10(3)) %1 ==0;
        //max int ka log lena h fr 3 ki power m lekr max int possible which is 3 power needs to 
        //be calculated   
        //3 ⌊log3​ MaxInt⌋ =3** ⌊19.56⌋ =3 **19  =1162261467
        return n>0 && 1162261467 %n ==0;
    }
}