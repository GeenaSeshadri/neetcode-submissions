class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null||t==null||s.length()==0||t.length()==0){
            return false;
        }
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] word1=s.toCharArray();
        char[] word2=t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        if(Arrays.equals(word1,word2)){
            return true;
        }
        return false;

    }
}
