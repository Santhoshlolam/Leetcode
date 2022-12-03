class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        /*int n=grid.length;
        int n1=grid[0].length;
        int[n+n1] arr=new int[n+n1];
        int[n+n1] arr1=new int[n+n1]; */
       /* int[n][n1] arr=new int[n][n1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++)
            {
                int sum1=0;
                int sum11=0;
                int sum0=0;
                int sum00=0;
                int ii=i;
                int jj=j;
                for(ii=i;ii<)
                
                
            }
        } */
        
        
       /* int n=grid.length;
        int n1=grid[0].length;
        int[] arr=new int[n+n1];
        int[] arr1=new int[n1+n1];
        int ii=0;
        for(int i=0;i<n;i++)
        { int count=0;
            for(int j=0;j<n1;j++)
            {
                if(grid[i][j]==1)
                    count++;
            }
         arr[ii++]=count;
        }
        for(int i=0;i<n;i++)   
        {int count=0;
            for(int j=0;j<n1;j++)
            {
                if(grid[i][j]==0)
                    count++;
            }
         arr[ii++]=count;
        }
        int jj=0;
        for(int i=0;i<n1;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
                if(grid[j][i]==1)
                      count++;
            arr1[jj++]=count;
        }
        for(int i=0;i<n1;i++)
        {int count=0;
            for(int j=0;j<n;j++)
                if(grid[j][i]==0)
                    count++;
            arr1[jj++]=count;
        }
        int ok=0;
        int ok1=n;
        for(int i=0;i<n;i++)
        {ok1=0;
        for(int j=0;j<n1;j++)
        {
            
            int sum1=arr[ok]-arr[ok+n1];
            int sum2=arr1[ok1]-arr1[ok1+n1];
            grid[i][j]=sum1+sum2;
            ok1++;
        
        }
            ok++;
        
        }
        
        return grid;  */
        
        int[] row1=new int[grid.length];
        int[] col1=new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {int count=0;
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1)
                    count++;
         row1[i]=count;
        }     
        for(int i=0;i<grid[0].length;i++)
        {  int count=0;
            for(int j=0;j<grid.length;j++)
                if(grid[j][i]==1)
                    count++;
         col1[i]=count;
        }
        
    for(int i=0;i<grid.length;i++)
    {     int sum1=row1[i];
        for(int j=0;j<grid[0].length;j++)
        {
            int sum2=col1[j];
            grid[i][j]=sum1+sum2-(grid.length-sum1)-(grid[0].length-sum2);
        }
            
    }
        
        
        return grid;
        
    }
}