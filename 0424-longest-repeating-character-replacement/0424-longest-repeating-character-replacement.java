class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==1)
            return 1;
        int start=0;
        int max=0;
        int max1=0;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'A']++;
            max=Math.max(arr[s.charAt(i)-'A'],max);
            if((i-start)+1-max>k)
            {
                arr[s.charAt(start)-'A']--;
                start++;
            }
            max1=Math.max(max1,i-start+1);
        }
        return max1;
    }
}