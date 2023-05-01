class Solution {
    public boolean isAnagram(String s, String t) {
       long sum=1;
        long sum2=1;
        for(int i=0;i<s.length();i++)
            sum=sum*((long)s.charAt(i));
        for(int i=0;i<t.length();i++)
            sum2=sum2*((long)t.charAt(i));
        
        
        HashMap<Character,Integer> ok=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(ok.containsKey(s.charAt(i)))
                ok.put(s.charAt(i),ok.get(s.charAt(i))+1);
            else
                ok.put(s.charAt(i),1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(ok.containsKey(t.charAt(i)))
                ok.put(t.charAt(i),ok.get(t.charAt(i))+1);
            else
                ok.put(t.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> II:ok.entrySet())
            if(II.getValue()%2!=0)
                return false;
        return true && sum==sum2;
        }
}