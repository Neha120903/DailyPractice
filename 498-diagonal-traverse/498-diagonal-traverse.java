class Solution {
    public static int[] findDiagonalOrder(int [][]arr)
    {
        int n =arr.length;
        int m = arr[0].length;
        int []ans = new int[n*m];
            int k=0;
        for (int i = 0; i <m+n-1 ; i++) {    //m+n-1 is number of diagonal
            int r= 0;
            int c=0;
            
            if(i < m)
            {
                r=0;
                c=i;
            }
            else{
                c=m-1;
                r=i-m+1;
            }
            ArrayList<Integer> al = new ArrayList<>();

            while (r <n && c>=0)
            {
                al.add(arr[r][c]);
                r++;
                c--;
            }
            if(i%2==0)
            {
                for (int j = al.size()-1; j >=0; j--) {
                    ans[k] = al.get(j);
                    k++;
                }
            }
            else{
                for (int j = 0; j < al.size(); j++) {
                    ans[k] =al.get(j);
                    k++;
                }
            }
        }
        return ans;
    }
}