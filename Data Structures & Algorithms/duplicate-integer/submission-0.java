class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums==null ||nums.length==0){
            return false;
        }
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            if(!(set.contains(num))){
                set.add(num);
            }
            else{
                return true;
            }
        }
        return false;
    }
}