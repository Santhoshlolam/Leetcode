class Solution {
    public int strStr(String haystack, String needle) {
      //  return haystack.indexOf(needle);
        
        HashMap<String,Integer> ok=new HashMap<String,Integer>();
            String str;
        int count=0;
        for(int i=0;i<haystack.length();i++)
        {       str="";
            for(int j=i;j<haystack.length();j++)
            {   str=str+haystack.charAt(j);
                if(!ok.containsKey(str))
                    ok.put(str,i);
                
            }
        }
        
     
        
        int min=-1;
        for(Map.Entry<String,Integer> II:ok.entrySet())
        { //   System.out.println(II.getKey()+" "+II.getValue());
            if(II.getKey().equals(needle))
            {
                min=II.getValue();
            }
        }
        
        return min;
    }
}