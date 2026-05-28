class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
     
        Arrays.sort(nums);
  
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int result=0;
        for(int num:set){
          if(!set.contains(num-1)){
            int current=num;
            int length=1;
            while(set.contains(current+1)){
                current+=1;
                length+=1;
            }
            result=Math.max(result,length);
          }
            
        }

        return result;
        
    }
}
