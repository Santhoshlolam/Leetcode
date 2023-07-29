class Solution {
    public void sortColors(int[] nums) {
     
     /* for(int i=0;i<nums.length;i++)
      {
        int flag=0;
          for(int j=0;j<nums.length-1-i;j++)
          {
              if(nums[j]>nums[j+1])
              {
                  int temp=nums[j];
                  nums[j]=nums[j+1];
                  nums[j+1]=temp;
                  flag=1;
              }
          }
          if(flag==0)
              break;
        
      }  */
        
       int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
            else
            {
                if(nums[mid]==2)
                {
                    int temp=nums[high];
                    nums[high]=nums[mid];
                    nums[mid]=temp;
                    high--;
                }
            }
        }
        
        
    }
}