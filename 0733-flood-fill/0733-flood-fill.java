class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        int inicolor=image[sr][sc];
        color(image,sr,sc,row,col,color,inicolor);
        
        return image;
    }
    public static void color(int[][] image,int sr,int sc,int[] row,int[] col,int color,int inicolor)
    {
        image[sr][sc]=color;
        for(int i=0;i<4;i++)
        {
            int ok=sr+row[i];
            int ok1=sc+col[i];
            if(ok>=0 && ok<image.length && ok1>=0 && ok1<image[0].length && image[ok][ok1]!=color && image[ok][ok1]==inicolor)
            {
                color(image,ok,ok1,row,col,color,inicolor);
            }
        }
    }
}