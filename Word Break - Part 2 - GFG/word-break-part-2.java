// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    
    static void mString(Set<String> setD,Queue<Character> q,List<String> res,String result)
    {
        if(q.isEmpty()) res.add(result.substring(1));
        String str = "";
        while(!q.isEmpty())
        {
            str += Character.toString(q.remove());
            if(setD.contains(str))
            {
                Queue<Character> qTemp = new LinkedList<>(q);
                mString(setD,qTemp,res,result+" "+str);
            }
        }
    }
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        Set<String> setD = new HashSet<>(dict);
        Queue<Character> q = new LinkedList<>();
        List<String> res = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            q.add(s.charAt(i));
        }
        mString(setD,q,res,"");
        return res;
    }
} 
