class Solution {
    public int maxArea(int[] height) {
    /*   int[] pre=new int[height.length];
        int[] suf=new int[height.length];
        
    int max=Integer.MIN_VALUE;
    for(int i=0;i<height.length;i++)
    {
        max=Math.max(height[i],max);
        pre[i]=max;
    }
         max=Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--)
        {
            max=Math.max(max,height[i]);
                suf[i]=max;
            
        }
        int count=0;
    for(int i=0;i<height.length;i++)
    {
        count=count+(Math.max(pre[i],suf[i])-height[i]);
    }
        return count;   */
        
      int max=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        int ele;
        while(i<j)
        {  // if(height.length>2)
             ele=Math.min(height[i],height[j])*(j-i);
     //    else
       //      ele=Math.min(height[i],height[j])*(j-i);
            max=Math.max(max,ele);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}