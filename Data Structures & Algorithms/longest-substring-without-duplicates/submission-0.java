class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s==null){
            return 0;
        }
        HashSet<Character> set= new HashSet<>();
        int result=0;
        for(int i=0;i<s.length();i++){
            int length=0;
            int j=i;
            set.clear();
            while( j<s.length() && !set.contains(s.charAt(j)) ){
                length+=1;
                set.add(s.charAt(j));
                j+=1;
            }
          
            result=Math.max(result,length);
            
        }
        return result;
    }
}
