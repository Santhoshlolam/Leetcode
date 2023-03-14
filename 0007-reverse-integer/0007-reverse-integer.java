class Solution {
    public int reverse(int x) {
        long num=0;
        long xx=0;
        if(x<0)
            xx=x-(2*x);
        else
            xx=x;
        while(xx!=0)
            {
            long dig=xx%10;
            num=num*10+dig;
            xx=xx/10;
            }
        if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE)
            return 0;
        if(x<0)
            return (int)(num-(num*2));
        else
            return (int)num;
        
    }
}