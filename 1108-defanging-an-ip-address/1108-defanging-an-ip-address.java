class Solution {
    public String defangIPaddr(String address) {
        StringBuffer ok=new StringBuffer();
        for(int i=0;i<address.length();i++)
            if(address.charAt(i)=='.')
                ok.append("[.]");
        else
            ok.append(address.charAt(i));
        return ok.toString();
    }
}