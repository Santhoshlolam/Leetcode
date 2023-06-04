class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if(nums.length==1 )
            if(nums[0]==k)
                return 1;
            else
                return 0;
        int total=0;
        HashMap<Integer,Integer> ok=new HashMap<Integer,Integer>();
        
        int sum1=0;
        int k1=k;
        
        for(int i=0;i<nums.length;i++)
        {
            sum1=sum1+nums[i];
            if(sum1==k)
                total++;
            if(ok.containsKey(sum1-k1))
                total=total+ok.get(sum1-k1);
            if(ok.containsKey(sum1))
                ok.put(sum1,ok.get(sum1)+1);
            else
                ok.put(sum1,1);
        }
        System.out.println(ok);
        return total;
        
        
    }
}