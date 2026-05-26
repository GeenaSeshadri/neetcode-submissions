class Solution {

    public String encode(List<String> strs) {
        //encode sends the list as a string
        StringBuilder str= new StringBuilder();
        for(String word:strs){
            str.append(word.length());
            str.append('&');
            str.append(word);
        }
        String result= new String();
        result=str.toString();

        return result;

    }

    public List<String> decode(String str) {
            if(str.length()==0){
                return Collections.emptyList();
            }
            List<String> ans= new ArrayList<>();
            int i=0;
            while(i<str.length()){
                int j=i;
                while(str.charAt(j)!='&'){
                  j+=1;
                }
                int len = Integer.parseInt(str.substring(i, j));
                String res=str.substring(j+1,j+len+1);
                ans.add(res);
                i = j + 1 + len;
            }
            
            
            
        return ans;
    }
}
