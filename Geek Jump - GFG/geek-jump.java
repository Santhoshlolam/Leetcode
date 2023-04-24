//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
        //code here
      //  return compute(arr,N-1);
     /*   int[] ok=new int[N+1];
        for(int i=0;i<N+1;i++)
        ok[i]=-1;
          return compute(arr,N-1,ok);
    }
    public static int compute(int[] arr,int ind,int[] ok)
    {
        if(ind==0)
        return 0;
        if(ok[ind]!=-1)
        return ok[ind];
        int ele1=compute(arr,ind-1,ok)+Math.abs(arr[ind]-arr[ind-1]);
        int ele2=Integer.MAX_VALUE;
        if(ind>1)
            ele2=compute(arr,ind-2,ok)+Math.abs(arr[ind]-arr[ind-2]);
        return ok[ind]=Math.min(ele1,ele2);  */
        
        
        
        int n=N;
  int prev=0;
  int prev2=0;
  for(int i=1;i<N;i++){
      
      int jumpTwo = Integer.MAX_VALUE;
      int jumpOne= prev + Math.abs(arr[i]-arr[i-1]);
      if(i>1)
        jumpTwo = prev2 + Math.abs(arr[i]-arr[i-2]);
    
      int cur_i=Math.min(jumpOne, jumpTwo);
      prev2=prev;
      prev=cur_i;
  } 
  return prev;
    }
    
}