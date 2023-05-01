class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      /*  HashMap<String,Integer> ok=new HashMap<String,Integer>();
        for(int i=0;i<strs.length;i++)
        {
            int sum=1;
            String str=strs[i];
            for(int j=0;j<str.length();j++)
                sum=sum*((int)str.charAt(j));
            ok.put(str,sum);
        }
        Set<Integer> okk=new HashSet<Integer>();
        for(Map.Entry<String,Integer> II:ok.entrySet())
        {
            okk.add(II.getValue());
        }
     //   Collections.sort(okk);
        System.out.println(ok);
        List<List<String>> res=new ArrayList<>();
        System.out.println(okk);
        for(Integer i:okk)
        {
           // String temp="";
            List<String> temp1= new ArrayList<String>();
            for(Map.Entry<String,Integer> II:ok.entrySet())
            {
               if(II.getValue()==i)
                  temp1.add(II.getKey()); 
            }
            res.add(temp1);
            
        }
        
        return res;   */
        List<List<String>> res=new ArrayList<>();
       HashMap<String,List<String>> ok=new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++)
        {
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            StringBuffer buf=new StringBuffer();
            for(int j=0;j<arr.length;j++)
                buf.append(arr[j]);
            String s=buf.toString();
            if(!ok.containsKey(s))
            {
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                ok.put(s,temp);
            }
            else
            {
                List<String> temp=ok.get(s);
                temp.add(strs[i]);
                ok.put(s,temp);
            }
        }
        for(Map.Entry<String,List<String>> II:ok.entrySet())
            res.add(II.getValue());
      //  System.out.println(ok);
        return res;
    }
}