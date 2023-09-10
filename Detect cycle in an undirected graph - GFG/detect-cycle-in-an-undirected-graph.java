//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
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
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] visited=new int[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            if(bfs(i,visited,adj)==true)
            return true;
        }
        return false;
    }
    public static boolean bfs(int node,int[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        Queue<ArrayList<Integer>> ok=new LinkedList<>();
        
        visited[node]=1;
        ArrayList<Integer> okk=new ArrayList<Integer>();
        okk.add(node);
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
        return false;
        
    }
}