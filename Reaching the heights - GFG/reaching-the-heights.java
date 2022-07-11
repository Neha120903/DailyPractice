// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.reaching_height(N, arr);
        	
        	if(ans.size() == 1 && ans.get(0) == -1){
        	    System.out.println("Not Possible");
        	    continue;
        	}
        	
        	for(int i: ans)
        	    System.out.print(i + " ");
        	System.out.println();
		}
	}
}






// } Driver Code Ends


//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> reaching_height (int n, int arr[]) {
        //Complete the function
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //Simple Two Pointer
        Arrays.sort(arr);
        
        int x = n-1;
        int y= 0;
        //X = Right End Pointer >> updates after every iteration and reaches to the mid of the array
        //Y = Left Start Pointer >> updates after every iteration and reaches to the mid of the array
        
        
        
        if(n==1){
            list.add(arr[0]);
            return list;
        }
        
        if(arr[x]==arr[y]){
            list.add(-1);
            return list;
        }
        
        
        //If and Else Block is for Finding Even or Odd size of the Array.
        
        if(n%2==0){
            while(x>=n/2 && y<=n/2){
                list.add(arr[x]);
                list.add(arr[y]);
                x=x-1;
                y=y+1;
            }
        } else {
            while(x>=(n/2) || y<n/2){
                if(x>=n/2)
                list.add(arr[x]);
                
                if(y<n/2)
                list.add(arr[y]);
                x=x-1;
                y=y+1;
            }
        }
        
        return list;
    }
    
    
}
