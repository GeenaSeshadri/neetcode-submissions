class Solution {
    public int characterReplacement(String s, int k) {
        if(s==null || s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> maps= new HashMap<>();
        int res=0;
        int left=0;
        int maxf=0;
        for(int right=0;right<s.length();right++){
            maps.put(s.charAt(right),maps.getOrDefault(s.charAt(right),0)+1);
            maxf=Math.max(maxf,maps.get(s.charAt(right)));
            while((right-left+1)-maxf>k){
                maps.put(s.charAt(left),maps.get(s.charAt(left))-1);
                left+=1;
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}
