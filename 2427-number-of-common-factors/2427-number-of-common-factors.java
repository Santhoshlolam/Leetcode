class Solution {
    public int commonFactors(int a, int b) {
       /* ArrayList<Integer> ok=new ArrayList<Integer>();
        ArrayList<Integer> ok1=new ArrayList<Integer>();
        for(int i=1;i<=a;i++)
            if(a%i==0)
                ok.add(i);
        for(int i=1;i<=b;i++)
            if(b%i==0)
                ok1.add(i);
        Collections.sort(ok);
        Collections.sort(ok1);
        int count=0;
        if(ok.size()<ok1.size())
        {
            for(int i=0;i<ok.size();i++)
                if(ok.get(i)==ok1.get(i))
                    count++;
        }
        else
        {
            for(int i=0;i<ok1.size();i++)
                if(ok.get(i)==ok1.get(i))
                    count++;
            
        }
        return count; */
        int k=0;
        if(a<b)
            k=a;
        else
            k=b;
        int count=0;
        for(int i=1;i<=k;i++)
            if(a%i==0 && b%i==0)
                count++;
        return count;
    }
}