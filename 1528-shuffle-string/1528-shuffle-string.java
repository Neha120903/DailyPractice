class Solution {
    public String restoreString(String s, int[] a) {
        char ans[] = new char[a.length];
        for(int i=0; i<a.length;i++)
        {
            ans[a[i]]=s.charAt(i);
        }
        return String.valueOf(ans);
    }
}