// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
        


// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int n, int arr[])
    {
        //code here.
         ArrayList<Integer> res = new ArrayList<Integer>();

       int max1 = Integer.MIN_VALUE;
       int max2 = Integer.MAX_VALUE;
       max1=arr[0];
       for(int i=0;i<n;i++)
       {
           if(arr[i]>max1)
            max1=arr[i];
       }
       max2=-1;
       for(int i=0;i<n;i++)
       {
           if(arr[i]!=max1){
               if(max2 == -1)
                    max2 = arr[i];
                else if(arr[i]>max2)
                    max2=arr[i];
           }
       }
       res.add(max1);
       res.add(max2);
       return res;
    }
}

// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.largestAndSecondLargest(sizeOfArray, arr);
		    System.out.println(res.get(0) + " " + res.get(1) );
		}
	}
}  // } Driver Code Ends