class Solution {
    public int findMin(int[] nums) {
       int n=nums.length;
    int lo=0;
    int high=n-1;
        if(nums[lo]<=nums[high])
            return nums[lo];
        while(lo<=high)
        {    int mid=(lo+high)/2;
             if(mid<n-1 && nums[mid]>nums[mid+1]  )
                return nums[mid+1];
            
            if(mid>0 && nums[mid-1]>nums[mid])
                return nums[mid];
            
            if(nums[mid]>nums[lo])
                lo = mid+1;
            
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}