class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0){
            return new int[]{0};

        }
        
        HashMap<Integer,Integer> maps= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(maps.entrySet());
        list.sort((a,b)-> b.getValue()-a.getValue());
        int[] result= new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i).getKey();
        }

    return result;
    }
}
