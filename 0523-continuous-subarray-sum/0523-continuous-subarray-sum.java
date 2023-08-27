class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n==1)
            return false;
        if(n<=2)
             if(nums[0]+nums[1]==0)
                return true;
             else if(nums[0]+nums[1]<k)
                return false;
        
        
        
      /*  long[] pre=new long[n];
        long[] suf=new long[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++)
            pre[i]=pre[i-1]+nums[i];
        
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
            suf[i]=suf[i+1]+nums[i];
        
        boolean flag=false;
        
               
        for(int i=1;i<n;i++)
        {  
            if(multi(k,pre[i]))
                flag=true;
        }
        
        for(int i=n-1;i>=0;i--)
        {   
            if(multi(k,suf[i]))
                flag=true;
        }
        
        for(int i=2;i<n;i++)
        {
            for(int j=0;j<i-2;j++)
            { 
                if(multi(k,(pre[i]-pre[j])))
                    flag=true;
                    
            }
        }
               
        for(int i=n-3;i>=0;i--)
        {
            for(int j=n-1;j>i+2;j--)
                if(multi(k,(suf[i]-suf[j])))
                    flag=true;
        }
        
        
        return flag;
        
    }
    public static boolean multi(int k,long n)
    {   
    
        if(n%k==0)
            return true;
        else
            return false;

    }  */
        
    HashMap<Integer,Integer> ok=new HashMap<Integer,Integer>();
    int sum=0;
        ok.put(0,0);
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(!ok.containsKey(sum%k))
                ok.put(sum%k,i+1);
            else if(ok.containsKey(sum%k))
            {
                if(ok.get(sum%k)<i)
                    return true;
            }
        }
        return false;
        
    }
    
        
}