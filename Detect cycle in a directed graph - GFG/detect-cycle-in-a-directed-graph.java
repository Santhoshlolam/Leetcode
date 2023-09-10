//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
      /*  int[] visited=new int[V];
        Queue<ArrayList<Integer>> ok=new LinkedList<>();
        
        visited[0]=1;
        ArrayList<Integer> okk=new ArrayList<Integer>();
        okk.add(0);
        okk.add(-1);
        ok.add(okk);
        while(!ok.isEmpty())
        {
            ArrayList<Integer> temp=ok.poll();
            int ele1=temp.get(0);
            int ele2=temp.get(1);
            ArrayList<Integer> temp1=adj.get(ele1);
            for(int i=0;i<temp1.size();i++)
            {
                if(visited[temp1.get(i)]==0)
                {
                    visited[temp1.get(i)]=1;
                    ArrayList<Integer> temp11=new ArrayList<Integer>();
                    temp11.add(temp1.get(i));
                    temp11.add(ele1);
                    ok.add(temp11);
                }
                else if(ele2!=temp1.get(i))
                return true;
                
            }
            
        }
        return false;   */
        
        
        int[] visited=new int[V];
        int[] path=new int[V];
       
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                if(dfs(i,visited,path,adj)==true)
                return true;
            }
            
        }
        return false;
    }
    public static boolean dfs(int node,int[] visited,int[] path,ArrayList<ArrayList<Integer>> ok)
    {
        visited[node]=1;
        path[node]=1;
        ArrayList<Integer> temp=ok.get(node);
        for(int i=0;i<temp.size();i++)
        {
            if(visited[temp.get(i)]==0)
            {
                if(dfs(temp.get(i),visited,path,ok)==true)
                return true;
            }
            else if(path[temp.get(i)]==1)
            return true;
            
        }
        path[node]=0;
        return false;
    }
}