class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{0};

        }
        HashMap<Integer,Integer> maps= new HashMap<>();
        maps.put(nums[0],0);
        int start=nums[0];
        for(int i=1;i<nums.length;i++){
            int end=target-nums[i];
            if(maps.containsKey(end)){
                return new int[]{maps.get(end),i};
            }
            maps.put(nums[i],i);
        }
        return new int[]{0};
    }
}
