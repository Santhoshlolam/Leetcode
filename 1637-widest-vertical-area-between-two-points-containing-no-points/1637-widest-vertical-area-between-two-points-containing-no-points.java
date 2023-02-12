class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr=new int[points.length];
        int j=0;
        for(int i=0;i<points.length;i++)
        {
            arr[j]=points[i][0];
            j++;
        }
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int ok=arr[i+1]-arr[i];
            if(c<ok)
                c=ok;
        }
        return c;
    }
}