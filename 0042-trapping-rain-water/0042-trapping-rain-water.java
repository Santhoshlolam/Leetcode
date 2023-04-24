class Solution {
    public int trap(int[] height) {
        
        int[] pre=new int[height.length];
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
     /*   for(int i=0;i<height.length;i++)
        {
            System.out.println(pre[i]+" "+suf[i]);
        }   */
    for(int i=0;i<height.length;i++)
    {
        count=count+(Math.abs(Math.min(pre[i],suf[i])-height[i]));
    }
        return count;

    }
}