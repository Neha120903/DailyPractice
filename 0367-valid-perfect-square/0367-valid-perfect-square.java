class Solution {
    public boolean isPerfectSquare(int num) {
        long lft= 1;
        long rht= num;
        while(lft<=rht){
            long mid= lft+ (rht-lft)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                lft= mid+1;
            }
            else{
                rht= mid-1;
            }
        }
        return false;
    }
}