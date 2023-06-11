class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
       int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        int cur=0;
        int p=nums[0];
        int m=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            cur=p+nums[i];
            p=Math.max(m,p);
            m=cur;
            dp[i]=cur;
        }
        
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++)
            max1=Math.max(max1,dp[i]);
        return max1;
        
    }
}