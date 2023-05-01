//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuffer ok=new StringBuffer();
        ok.append(S.charAt(0));
        int i=1;
        while(i!=S.length())
        {
            if(S.charAt(i-1)!=S.charAt(i))
            {
            ok.append(S.charAt(i));
            i++;
                
            }
            else
            i++;
        }
        return ok.toString();        
        
    }
}