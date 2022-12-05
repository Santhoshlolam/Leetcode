class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     /*   Set<Character> ok=new HashSet<Character>();
        for(int i=0;i<jewels.length();i++)
            ok.add(jewels.charAt(i));
        for(int i=0;i<stones.length();i++)
            ok.add(stones.charAt(i));
        //return //jewels.length()+stones.length()-ok.size();
    return ok.size();  */
        ArrayList<Character> ok=new ArrayList<Character>();
        for(int i=0;i<jewels.length();i++)
            ok.add(jewels.charAt(i));
        int count=0;
        for(int i=0;i<stones.length();i++)
            if(ok.contains(stones.charAt(i)))
                count++;
        return count;
        
    }
}