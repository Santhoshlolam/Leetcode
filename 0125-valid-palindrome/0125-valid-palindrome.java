class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        s=s.toLowerCase();
        String str1="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) 
           { str=str+s.charAt(i);
           str1=s.charAt(i)+str1;}
            else if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9)
         {   str=str+s.charAt(i);
         str1=s.charAt(i)+str1;}
        }
        if(str.equals(str1))
        return true;
        else
        return false;
        
    }
}