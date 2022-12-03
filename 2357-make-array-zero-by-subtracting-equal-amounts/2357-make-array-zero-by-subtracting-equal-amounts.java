class Solution {
    public int minimumOperations(int[] nums) {
      /*  Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count++;
            for(int j=0;j<nums.length;j++)
                nums[i]=nums[j]-nums[j];
            if(cou(nums))
                return count;
        }
        return count;
    }
    public static boolean cou(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0)
                count++;
     if(count==nums.length)
         return true;
        else
            return false; */
        
       Set<Integer> ok=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            if(nums[i]>0)
                ok.add(nums[i]);
        
        return ok.size();
    }
}