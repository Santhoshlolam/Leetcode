class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char ok1[]=s.toCharArray();
    char ok2[]=t.toCharArray();

    if(m<1)
        return true;

    while(i<n){
        if(ok2[i]==ok1[j]){
            j++;
        }
        i++;
        
    if(j==m)
        return true;
    }

        return false;
    

    }
}