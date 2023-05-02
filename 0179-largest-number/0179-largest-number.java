class Solution {
    public String largestNumber(int[] nums) {
     //   TreeMap<Character,Integer> ok=new TreeMap<Character,Integer>();
       /* for(int i=0;i<=9;i++)
        {
            ok.put((char)(i+'0'),0);
        }*/
     /*   for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            while(num!=0)
            {
                int dig=num%10;
                char dig1=(char)(dig+'0');
                if(ok.containsKey(dig1))
                    ok.put(dig1,ok.get(dig1)+1);
                else
                    ok.put(dig1,1);
                num=num/10;
            }
        }
        System.out.println(ok);
        StringBuffer okk=new StringBuffer();
        for(Map.Entry<Character,Integer> II:ok.entrySet())
        {
            int n=II.getValue();
            for(int i=0;i<n;i++)
                okk.append(II.getKey());
        }
        okk.reverse();
        return okk.toString();   */
        
   /*     ArrayList<String> ok=new ArrayList<String>();
        StringBuffer okk=new StringBuffer();
        boolean[] flag=new boolean[nums.length];
        fun(nums,ok,okk,flag);
        Collections.sort(ok);
        System.out.println(ok);
        return ok.get(ok.size()-1);
    }
    public static void fun(int[] nums,ArrayList<String> ok,StringBuffer okk,boolean[] flag)
    {
        if(okk.length()==nums.length)
        {
            ok.add(okk.toString());
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!flag[i])
            {
                flag[i]=true;
                okk.append(""+nums[i]);
                fun(nums,ok,okk,flag);
                okk.deleteCharAt(okk.length()-1);
                flag[i]=false;
            }
        }  */
        int count=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0)
                count++;
        if(count==nums.length)
            return "0";
        
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                String temp=""+nums[i]+nums[j];
                String temp1=""+nums[j]+nums[i];
                if(temp1.compareTo(temp)>0)
                {
                    int temp11=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp11;
                }
            }
        }
        
        StringBuffer ok=new StringBuffer();
      //  ok.reverse();
        for(int i=0;i<nums.length;i++)
            ok.append(nums[i]);
        return ok.toString();
        
        
    }
}