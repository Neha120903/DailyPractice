class Solution {
    public String largestNumber(int[] arr) {
        if (arr == null || arr.length == 0) return "";
        int n =arr.length;
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = arr[i]+"";
        }
        Arrays.sort(s, (a,b) -> {
                    long n1 = Long.parseLong(a+b);
                    long n2 = Long.parseLong(b+a);

                    if(n1 > n2)
                        return 1;
                    else if( n1 < n2)
                        return -1;
                    else
                        return 0;
                    });
        if (s[s.length-1].charAt(0) == '0') return "0";
        String res="";
       for(int i=n-1;i>=0;i--)
           res+=s[i];
        return res;

    }
}