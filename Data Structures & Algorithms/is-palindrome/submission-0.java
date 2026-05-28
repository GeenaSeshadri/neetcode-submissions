class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0){
            return false;
        }
        StringBuilder dup= new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                dup.append(Character.toLowerCase(ch));
            }
        }

        return dup.toString().equals(dup.reverse().toString());
       

       
        
    }
}
